package com.MyCompany.OOP_2;

import com.MyCompany.OOP_1.*;

public class MyClass {
    public static void main(String[] args){
        Ball ball = new Ball(5, 5, 4, 3, -5);
        Container rectangle = new Container(0, 0, 20, 100);

        System.out.println(ball);
        System.out.println(rectangle);
        System.out.println("Ball in container?: " + rectangle.collides(ball));


        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        System.out.println("Changing parameters...");
        ball.setxDelta(-6);
        ball.setyDelta(20);

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        System.out.println("Reflecting X direction");
        ball.reflectHorizontal();

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");

        ball.move();
        System.out.println(ball.toString());
        System.out.println("Ball in container?: " + rectangle.collides(ball) + "\n");
    }
}
