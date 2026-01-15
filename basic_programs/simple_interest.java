import java.util.Scanner;
class simple_interest
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principle amount:");
		int prin=sc.nextInt();
		System.out.print("Enter the time period in years:");
		int timem=sc.nextInt();
		System.out.print("Enter the rate of interest:");
		int rate=sc.nextInt();
		double sint=(prin*timem*rate)/100;
		System.out.println("The simple interest is:"+sint);
	}
}