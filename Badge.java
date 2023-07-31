package exercises.Static;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmloyeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        return generateRandomString(3) + employee.getName() + employee.getSurname() + generateRandomString(3);
    }
    private String generateRandomString(int limitInt) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < limitInt; i++) {
            int randomNumber = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randomNumber);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }
    public void showBadgeDetails() {
        System.out.println("Total number of employee tracked by the badges: " + totalNumberOfEmployees +
                " employee details: \n" + employee.getEmployeeDetails() +
                "\nBadge ID Code: " + badgeIdCode);
    }

    public Badge (Employee employeeThatNeedsBadge) {
        keepTrackOfEmloyeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();

    }







}
