package Package1;


public class Employee {
    static int employeeNumber = 987654;

    public static int getEmployeeNumber() {
        return employeeNumber;
    }

    public static void main(String[] args) {

        System.out.println(getEmployeeNumber());
    }
}