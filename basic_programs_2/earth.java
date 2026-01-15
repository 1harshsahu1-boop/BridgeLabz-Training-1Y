import java.util.Scanner;
class earth
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter distance in km:");
		int r=sc.nextInt();
		double pi=3.14;
		double vol=(pi*r*r*r*3)/4;
		double miles=vol*0.62;
		System.out.println("The volume of earth(km) is:"+vol);
	    System.out.println("The volume of earth(miles) is:"+miles);
	}
}