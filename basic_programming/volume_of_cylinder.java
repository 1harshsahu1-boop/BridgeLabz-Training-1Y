import java.util.Scanner;
class volume_of_cylinder
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		int r=sc.nextInt();
		System.out.print("Enter height:");
		int h=sc.nextInt();
		double pie=3.14;
		double vol=(pie*r*r*h);
		System.out.println("The volume of cylinder is:"+vol);
	}
}