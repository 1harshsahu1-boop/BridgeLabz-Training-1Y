package com.gla.assignment14;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int primitiveInt = scanner.nextInt();

        Integer wrapperInt = Integer.valueOf(primitiveInt);

        System.out.println("Primitive int value : " + primitiveInt);
        System.out.println("Integer object value: " + wrapperInt);
    }
}
