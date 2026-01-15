import java.util.Scanner;
class Farenheit_to_Celcius
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in celcius:");
		int celc=sc.nextInt();		
		double pie=3.14;
		double faren=(celc*9/pie)+32;
		System.out.println("Temperature in farenheit is:"+faren);
	}
}