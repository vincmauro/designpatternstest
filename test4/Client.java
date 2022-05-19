package com.finconsgroup.test.test4;

public class Client {

    public static void main(String[] args){

        Circle circle = new Circle(2.0);
        circle.printArea();

        Square square = new Square(2.0);
        square.printArea();

        Rectangle rectangle = new Rectangle(2.0, 3.0);
        rectangle.printArea();

    }

}
