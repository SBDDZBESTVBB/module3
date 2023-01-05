package dao;

import modal.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    static Connection connection = com.codegym.demo.dao.ConnectionMySql.getConnection();

    public static List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "Select * from employee";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                String address = resultSet.getString("Address");
                String phonenumber = resultSet.getString("PhoneNumber");
                double salary = resultSet.getDouble("Salary");
                String department = resultSet.getString("Department");
                employees.add(new Employee(id, name, email, address, phonenumber, salary, department));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public static void deletebyid(int id) {
        String sql = "delete FROM employee where id = " + id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> search(String search) {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee WHERE  upper(employee.Name) like  '%" + search.toUpperCase() + "%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                String address = resultSet.getString("Address");
                String phonenumber = resultSet.getString("PhoneNumber");
                double salary = resultSet.getDouble("Salary");
                String department = resultSet.getString("Department");
                employees.add(new Employee(id, name, email, address, phonenumber, salary, department));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public static boolean save(Employee employee) {
        String sql = "insert into product value (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getEmail());
            preparedStatement.setString(3, employee.getAddress());
            preparedStatement.setString(4, employee.getPhoneNumber());
            preparedStatement.setDouble(3, employee.getSalary());
            preparedStatement.setString(3, employee.getDepartment());

            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static Employee findById(int id) {
        String sql = "select * from product where id = " + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();

            String name = resultSet.getString("name");
            String email = resultSet.getString("Email");
            double salary = resultSet.getDouble("Salary");
            String phone = resultSet.getString("PhoneNumber");
            String address = resultSet.getString("Address");

            return new Employee(id, name, email, address, phone, salary, address);
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    public static boolean edit(Employee employee) {
        String sql = "update product set name=?, Email=?, Address=? PhoneNumber=? Salary=? DepartMent=?  where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(7,employee.getId());
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getEmail());
            preparedStatement.setString(3, employee.getAddress());
            preparedStatement.setString(3, employee.getPhoneNumber());
            preparedStatement.setString(3, String.valueOf(employee.getSalary()));
            preparedStatement.setString(3, employee.getDepartment());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
}
}

