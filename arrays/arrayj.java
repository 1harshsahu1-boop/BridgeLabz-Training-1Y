public class arraysort {
    public static void arraysort(int[] arr) {
        java.util.Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int[] num = {9,10,12,18,25,68};
        for (int n : num) {
            System.out.print(n + " ");
        }
        arraysort(num);
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}