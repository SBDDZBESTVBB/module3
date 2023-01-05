package modal;

public class Employee {
    int id;
    String Name;
    String Email;
    String Address;
    String PhoneNumber;
    double Salary;
    String Department;
    public Employee() {
    }

    public Employee(int id, String name, String email, String address, String phoneNumber, double salary, String department) {
        this.id = id;
        Name = name;
        Email = email;
        Address = address;
        PhoneNumber = phoneNumber;
        Salary = salary;
        Department = department;
    }

    public Employee(String name, String email, String address, String phoneNumber, double salary, String department) {
        Name = name;
        Email = email;
        Address = address;
        PhoneNumber = phoneNumber;
        Salary = salary;
        Department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}

