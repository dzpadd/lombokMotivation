package edu.dpadd.lombok;

import edu.dpadd.lombok.model.Employee;

public class App {

    public static void main(String[] args) {
        Employee firstEmployee = createEmployee("Steve", 120_000.6);
        Employee secondEmployee = createEmployee("Steve", 120_000.6);
        Employee thirdEmployee = createEmployee("Mark", 100_000.3);

        System.out.println("1: " + firstEmployee);
        System.out.println("2: " + secondEmployee);
        System.out.println("3: " + thirdEmployee);
        System.out.println("1 eq 2: " + firstEmployee.equals(secondEmployee));
        System.out.println("1 eq 3: " + firstEmployee.equals(thirdEmployee));
    }

    private static Employee createEmployee(String Steve, double salary) {
        Employee firstEmployee = new Employee();
        firstEmployee.setName(Steve);
        firstEmployee.setSalary(salary);
        return firstEmployee;
    }
}
