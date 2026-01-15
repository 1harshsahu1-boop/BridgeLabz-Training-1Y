import java.util.Scanner;
class Birthyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the birth year");
        int a=sc.nextInt();
        System.out.print("Enter current year:");
        int b=sc.nextInt();
        int age=b-a;
        System.out.println("The sum is:"+age);
    }
}