import java.util.Scanner;
class handshake
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of people:");
		int r=sc.nextInt();
		int p=r+1;
		double hs=(r*p)/2;
		System.out.print("The total is:"+hs+"handshhakes");
	}
}