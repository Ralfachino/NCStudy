package com.MyCompany.OOP_1;

public class MyClass {
    public static void main(String[] args){
        Circle circle = new Circle(15, "blue");
        System.out.println(circle.getColor());
        System.out.println(circle.toString());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(15, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        Employee employee = new Employee(15, "Dave", "Jonson", 2000);
        System.out.println(employee.toString());
        System.out.println(employee.raiseSalary(30));

        Author[] authors = new Author[3];
            authors[0] = new Author("Bill", "Bill@gmail.com", 'M');
            authors[1] = new Author("Donald", "Donald@gmail.com", 'M');
            authors[2] = new Author("Liza", "Bill@gmail.com", 'F');

        //System.out.println(authors[0].getName());

        Book book = new Book("Java", authors, 100);
        System.out.println(book.toString());
        System.out.println(book.getAuthorNames());
    }
}
