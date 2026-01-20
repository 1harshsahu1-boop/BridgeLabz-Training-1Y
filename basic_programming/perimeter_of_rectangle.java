import java.util.Scanner;
class perimeter_of_rectangle
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length:");
		int l=sc.nextInt();
		System.out.print("Enter breadth:");
		int b=sc.nextInt();
		int peri=2*(l+b);
		System.out.println("The perimetre is:"+peri);
	}
}