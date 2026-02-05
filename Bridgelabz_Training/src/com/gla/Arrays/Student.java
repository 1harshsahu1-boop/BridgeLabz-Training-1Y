package com.gla.Arrays;
public class Student{
    int age;
    int roll_no;
    String name;
    public void printinfo()
    {
        System.out.println("age :- "+age);
        System.out.println("roll no :- "+roll_no);
        System.out.println("name :- "+name);
    }
    public static void main(String []args){
        Student s1=new Student();
        int a=s1.age=18;
        int r=s1.roll_no=22;
        String name=s1.name="Harsh";
        s1.printinfo();
    }
}
