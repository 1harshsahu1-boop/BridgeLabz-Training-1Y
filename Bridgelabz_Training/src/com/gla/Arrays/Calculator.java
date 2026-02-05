package com.gla.Arrays;
import java.util.Scanner;
public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:-");
        int num2 = sc.nextInt();
    }
}
