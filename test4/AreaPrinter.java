package com.finconsgroup.test.test4;

//trasformo in classe astratta di cui implementerò il metodo

public abstract class AreaPrinter {

    public abstract void printArea();
   
}


//Implementazione precedente:

public static void printArea(Circle circle){
        System.out.println("Area is: " + circle.getArea());
    }

public static void printArea(Square square){
        System.out.println("Area is: " + square.getArea());
    }

public static void printArea(Rectangle rectangle){
        System.out.println("Area is: " + rectangle.getArea());
    }
