package com.practice.pack1;

import java.util.ArrayList;
import java.util.List;

public class Salary_Calculation {
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> labourDeptViolationReport = new ArrayList<>();

        // Create employees
        employees.add(new Manager(1, "Anusha"));
        employees.add(new Supervisor(1, "lavanya"));
        employees.add(new Supervisor(2, "Amara"));
        employees.add(new Worker(1, "Chanu"));
        employees.add(new Worker(2, "Pranav"));// Add more workers as needed

        // Calculate and print salaries
        double totalCost = 0;
        for (Employee employee : employees) {
            int hoursWorked = 50; // Change this value based on the actual hours worked by each employee
            if (hoursWorked > 60) {
                labourDeptViolationReport.add(employee);
                hoursWorked = 60;
            }

            int grossSalary = employee.calculateGrossSalary(hoursWorked);
            double tax = employee.calculateTax(grossSalary);
            double netSalary = employee.calculateNetSalary(grossSalary, tax);

            System.out.println(employee.getClass().getSimpleName() + " - " + employee.getClass().getSimpleName());
            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
            System.out.println("------------------------");

            totalCost += netSalary;
        }

        // Print total cost to the company
        System.out.println("Total Cost to the Company: " + totalCost);

        // Print Labour Department Violation Report
        System.out.println("Labour Department Violation Report:");
        for (Employee employee : labourDeptViolationReport) {
            System.out.println(employee.getClass().getSimpleName() + " - " + employee.getClass().getSimpleName() +
                    " (Employee ID: " + employee.calculateGrossSalary(0) + ") violated the 60-hour rule.");
        }
    }
}

interface Employee {
    int calculateGrossSalary(int hoursWorked);
    double calculateNetSalary(int grossSalary, double taxRate);
    double calculateTax(int grossSalary);
}

class Manager implements Employee {
    private int employeeId;
    private String name;

    Manager(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    @Override
    public int calculateGrossSalary(int hoursWorked) {
        return 500 * Math.min(hoursWorked, 40); // no overtime for manager
    }
    @Override
    public double calculateTax(int grossSalary) {
        return 0.3 * grossSalary; // Tax rate=30%
    }
    @Override
    public double calculateNetSalary(int grossSalary, double taxRate) {
        return grossSalary - taxRate;
    } 
}

class Supervisor implements Employee {
    private int employeeId;
    private String name;

    Supervisor(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int calculateGrossSalary(int hoursWorked) {
        int baseSalary = 300 * Math.min(hoursWorked, 40);
        int overtimeHours = Math.max(0, hoursWorked - 40);
        int overtimeSalary = 450 * overtimeHours;
        return baseSalary + overtimeSalary;
    }
    @Override
    public double calculateTax(int grossSalary) {
        return 0.2 * grossSalary; // Tax outgo= 20%
    }
    @Override
    public double calculateNetSalary(int grossSalary, double taxRate) {
        return grossSalary - taxRate;
    }
}

class Worker implements Employee {
    private int employeeId;
    private String name;

    Worker(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int calculateGrossSalary(int hoursWorked) {
        int baseSalary = 200 * Math.min(hoursWorked, 40);
        int overtimeHours = Math.max(0, hoursWorked - 40);
        int overtimeSalary = 300 * overtimeHours;
        return baseSalary + overtimeSalary;
    }
    @Override
    public double calculateTax(int grossSalary) {
        return 0.1 * grossSalary; // Tax outgo=10%
    }
    @Override
    public double calculateNetSalary(int grossSalary, double taxOutgo) {
        return grossSalary - taxOutgo;
    }
}

