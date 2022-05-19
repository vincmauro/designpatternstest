package com.finconsgroup.test.test4;

public class Square extends AreaPrinter {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void printArea(){
	area = sede*side;
	System.out.println("Area is: " + area);
    }

    
}

//public double getArea(){
        return side * side;
    }
