package com.BestCompany;

public class Employee implements Measurable {
    private Employee[] emp;
    private String name;
    private double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double average(Measurable[] objects) {
        int res = 0;
        for (Measurable num : objects) {
            res += num.getSalary();
        }
        return res / (double)objects.length;
    }

    @Override
    public double largest(Measurable[] objects) {
        double max = objects[0].getSalary();
        for (int i = 1; i < objects.length; i++) {
            if (max < objects[i].getSalary()) {
                max = objects[i].getSalary();
            }
        }
        return max;
    }

}
