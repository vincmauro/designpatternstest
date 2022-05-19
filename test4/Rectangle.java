package com.finconsgroup.test.test4;

public class Rectangle extends AreaPrinter {

    private double base;

    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
  
    @Override
    public void printArea(){
	double area = base*height;
	 System.out.println("Area is: " + area);
	
    
}


//public double getArea(){
        return base * height;
    }