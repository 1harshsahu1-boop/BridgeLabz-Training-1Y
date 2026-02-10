package com.gla.Methods;

public class Rectangle {
    public void areaOfrectangle(int lengthxbreadth) {
        System.out.println("Area of rectangle:");
        double area = length * breadth;
        System.out.println(area);
    }
    public void circumferenceOfPerimeter(int lengthxbreadth) {
        System.out.println("Perimeter of rectangle:");
        double perim = 2*(length+breadth)
        System.out.println(perim);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.areaOfrectangle(10);
        r.circumferenceOfCircle(20);
    }
}