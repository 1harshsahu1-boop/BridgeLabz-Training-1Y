package com.gla.Lists;
import java.util.ArrayList;
import java.util.List;
public class List1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        numbers.remove(1);
        System.out.println("After removal: " + numbers);

        System.out.println("Iterating through ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
