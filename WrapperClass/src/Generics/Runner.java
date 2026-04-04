package Generics;

public class Runner {
    public static void main(String[] args) {
        Box<Integer> b2=new Box<>();
        b2.setValue(10);
        int value1= b2.getValue();
        System.out.println("Value 1="+value1);

        Box<String> s1=new Box<>();
        s1.setValue("Harsh");
        String value2= s1.getValue();
        System.out.println("Value 2 ="+value2);
    }
}