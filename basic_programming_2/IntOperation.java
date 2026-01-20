import java.util.Scanner;
class intoperation
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		System.out.print("Enter third number:");
	    int c=sc.nextInt();
		int d=a+b*c;
		int e=a*b+c;
		int f=c+a/b;
		int g=a%b+c;
		System.out.print("The results are"+d+","+e+","+f+","+g);
	}
}