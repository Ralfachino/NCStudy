package com.BestCompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Circle circle = new Circle(point, 5);

        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Dave", 2000);
        employee[1] = new Employee("Steve", 8000);
        employee[2] = new Employee("Sarah", 3500);
        System.out.println(employee[1].average(employee));
        System.out.println(employee[1].largest(employee));

        Car car = new Car(0, 10, 100);
        System.out.println(car.drove(55));
        car.Refuel(56);
        System.out.println(car.drove(120));
        System.out.println(car.getX());

        MaxValueFactorialLottery max = new MaxValueFactorialLottery();

        Point point1 = new Point(3, 4);
        System.out.println(point1.translate(1, 3).scale(0.5));

        max.lottery();

        System.out.println(max.factorial(10));

        //System.out.println(max.Value());
        System.out.println(max.maxValue(3, 2, 1));


        Angle angle = new Angle();

        System.out.println(angle.angleNomalization(360));
        System.out.println(angle.angleNomalization(380));
        System.out.println(angle.angleNomalization(-20));

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number for change: ");
        int num = in.nextInt();

        ChangingTheNumberSystem toChange = new ChangingTheNumberSystem(num);
                System.out.println(toChange.binary(toChange.getNumberForChange()));
                System.out.println(toChange.octal(toChange.getNumberForChange()));
                System.out.println(toChange.hexadecimal(toChange.getNumberForChange()));


        }


    }
