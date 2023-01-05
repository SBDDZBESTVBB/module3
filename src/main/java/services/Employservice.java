package services;

import dao.EmployeeDao;
import modal.Employee;

import java.util.List;

public class Employservice {
    public static List<Employee> getAll() {
        return EmployeeDao.getAll();
    }

    public static void delete(int id) {
        EmployeeDao.deletebyid(id);
    }

    public static List<Employee> getsearch(String search) {
        return EmployeeDao.search(search);
    }
    public static boolean save(Employee employee){
        return EmployeeDao.save(employee);
    }
    public static Employee findById(int id){
        return EmployeeDao.findById(id);}
    public static boolean edit(Employee employee){
        return EmployeeDao.edit(employee);
    }
}
