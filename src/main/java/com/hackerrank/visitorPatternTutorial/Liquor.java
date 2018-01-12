package com.hackerrank.visitorPatternTutorial;

public class Liquor  implements Visitable{

    private double price;

    public Liquor(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
