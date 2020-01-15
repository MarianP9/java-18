package Inheritance.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Patrick");
        employee.setSalary(1000000);

        Developer developer = new Developer();
        developer.setName("Elliot");
        developer.setSalary(60000);
        developer.setBonus(2500);

    }
}
