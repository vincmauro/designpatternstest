package com.finconsgroup.test.test4;

public class Circle extends Area Printer {
	
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void printArea(){
	double area = radius * radius * 3.14;
    	System.out.println("Area is: " + area);







//vecchia implementazione 
public class Circle  {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * 3.14;
    }   
}
