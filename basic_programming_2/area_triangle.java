import java.util.Scanner;
class area_triangle
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base in cm:");
		int b=sc.nextInt();
		System.out.print("Enter the height in cm:");
		int h=sc.nextInt();
		double area=(b*h)/2;
		double inches = (area/2.54);
        double feet = (inches / 12);
        System.out.println("Your height is: "+inches+"inches");
		System.out.println("Your height is: "+feet+"feet");
		System.out.print("The area is:"+area+"cm");
	}
}