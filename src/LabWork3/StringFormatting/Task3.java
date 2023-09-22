package LabWork3.StringFormatting;

import java.text.DecimalFormat;

public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Артём Алексеевич", 90000);
        employees[1] = new Employee("Алексей Николаевич", 65000.75);
        employees[2] = new Employee("Светлана Николаевна", 70000.2);

        Report.generateReport(employees);
    }
}

class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках");
        System.out.printf("%-20s %10s%n", "Имя сотрудника", "Зарплата"); // %~ - выравнивание по левому краю, % - по правому. 20s - кол-во занимаемых символов

        DecimalFormat df = new DecimalFormat("#.00"); // #. сколько знаков после запятой

        for (Employee employee : employees) {
            System.out.printf("%-20s %10s%n", employee.getFullName(), df.format(employee.getSalary()));
        }
    }
}
