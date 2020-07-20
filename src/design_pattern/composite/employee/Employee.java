package design_pattern.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String role;
    private List<Employee> employees;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addEmployee(Employee employees) {
        this.employees.add(employees);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
