package LabWork4point1;

public class Task6 {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Генадий", "Хоров", 55000);
        Employer manager1 = new Manager("Алиса", "Александрова", 67000, 5000);

        Employer[] employees = new Employer[2];
        employees[0] = employer1;
        employees[1] = manager1;

        for (Employer employee : employees) {
            System.out.println("Employee: " + employee.getFullName());
            System.out.println("Income: " + employee.getIncome());
            System.out.println();
        }
    }
}

class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}