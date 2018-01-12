package com.hackerrank.visitorPatternTutorial;

public class VisitorTest {
    public static void main(String[] args) {
        TextVisitor textVisitor = new TextVisitor();
        TextHolidayVisitor textHolidayVisitor = new TextHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println("Normal Prices: \n");

        System.out.println(milk.accept(textVisitor) + "\n");
        System.out.println(vodka.accept(textVisitor) + "\n");
        System.out.println(cigars.accept(textVisitor) + "\n");

        System.out.println("Text Holiday Prices \n");

        System.out.println(milk.accept(textHolidayVisitor) + "\n");
        System.out.println(vodka.accept(textHolidayVisitor) + "\n");
        System.out.println(cigars.accept(textHolidayVisitor) + "\n");
    }
}
