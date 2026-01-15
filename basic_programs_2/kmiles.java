import java.util.Scanner;
class kmiles
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance in km:");
		int km=sc.nextInt();
		double miles=km*0.62;
		System.out.println("The distance in miles is:"+miles);
	}
}