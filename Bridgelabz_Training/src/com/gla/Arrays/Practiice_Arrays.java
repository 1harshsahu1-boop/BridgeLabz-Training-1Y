package com.gla.Arrays;
class arraysort {
    public static void arraysort(int[] arr) {
        java.util.Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int[] num = {64,12,25,18,10,9};
        for (int n : num) {
            System.out.print(n + " ");
        }
        arraysort(num);
        System.out.println("\n");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}