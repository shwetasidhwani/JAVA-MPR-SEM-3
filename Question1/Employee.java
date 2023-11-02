package Question1;

import java.util.*;

public class Employee {
    private List<EMP> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter year of joining: ");
            int year = sc.nextInt();
            System.out.println("Enter address: ");
            String address = sc.next();
            EMP e = new EMP(name, year, address);
            employee.employees.add(e);
        }

        System.out.println("Name        Year of Joining             Address");
        for (EMP emp : employee.employees) {
            System.out.println(emp.name + "\t\t" + emp.year + "\t\t\t" + emp.address);
        }
        sc.close();
    }
}