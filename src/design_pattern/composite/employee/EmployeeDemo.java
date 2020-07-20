package design_pattern.composite.employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee batbold = new Employee("Batbold", "Zahiral");
        Employee myagmarnaran = new Employee("Myagmarnaran", "Programist");
        Employee suren = new Employee("Suren", "Programist");
        Employee huslen = new Employee("Huslen", "Manager");
        batbold.addEmployee(myagmarnaran);
        batbold.addEmployee(suren);
        myagmarnaran.addEmployee(huslen);

        for (Employee employee : batbold.getEmployees()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getEmployees()) {
                System.out.println("sub-> " + employee1);
            }
        }
    }
}
