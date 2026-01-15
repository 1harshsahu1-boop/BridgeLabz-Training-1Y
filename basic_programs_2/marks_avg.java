import java.util.Scanner;
class marks_avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter maths number:");
        int m=sc.nextInt();
        System.out.print("Enter physics number:");
        int p=sc.nextInt();
		System.out.print("Enter chemistry number:");
        int c=sc.nextInt();
        int avg=(m+p+c)/3;
        System.out.println("The avg is:"+avg);
    }
}