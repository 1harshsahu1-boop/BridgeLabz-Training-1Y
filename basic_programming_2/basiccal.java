import java.util.Scanner;
class Addition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		double div=a/b;
        System.out.println("The sum is:"+sum);
		System.out.println("The sum is:"+sub);
		System.out.println("The sum is:"+mul);
		System.out.println("The sum is:"+div	);
    }
}