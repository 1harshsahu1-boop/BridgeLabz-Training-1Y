import java.util.Scanner;
class side_peri
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the perimeter:");
		int r=sc.nextInt();
		double side=(r)/4;
		System.out.print("The side is:"+side);
	}
}