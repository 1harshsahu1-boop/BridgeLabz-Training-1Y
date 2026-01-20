import java.util.Scanner;
class area_of_circle
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius:");
		int r=sc.nextInt();
		double pie=3.14;
		double area=(pie*r*r);
		System.out.print("The area is:"+area);
	}
}