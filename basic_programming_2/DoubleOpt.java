import java.util.Scanner;
class doubleoperation
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		double a=sc.nextInt();
		System.out.print("Enter second number:");
		double b=sc.nextInt();
		System.out.print("Enter third number:");
	    double c=sc.nextInt();
		double d=a+b*c;
		double e=a*b+c;
		double f=c+a/b;
		double g=a%b+c;
		System.out.print("The results are"+d+","+e+","+f+","+g);
	}
}