import java.util.Scanner;
class power
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int r=sc.nextInt();
		System.out.print("Enter the power:");
		int p=sc.nextInt();
		double res=Math.pow(r,p);
		System.out.print("The result is:"+res);
	}
}