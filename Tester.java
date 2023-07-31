package exercises.Static;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "123 Main Street");
        System.out.println(employee.getEmployeeDetails());

        Employee employee2 = new Employee("Carol", "Alexander", "456 Main Street");
        System.out.println(employee2.getEmployeeDetails());

        Badge badge = new Badge(employee);
        Badge badge2 = new Badge(employee2);

        badge.showBadgeDetails();
        badge2.showBadgeDetails();
















    }




}
