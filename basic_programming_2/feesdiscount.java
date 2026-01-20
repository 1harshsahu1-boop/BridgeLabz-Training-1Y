import java.util.Scanner;
class fees_discount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fees:");
        int f=sc.nextInt();
		System.out.print("Enter the discount:");
        int d=sc.nextInt();
        int da=(d*f)/100;
		int dp=f-da;
        System.out.println("The discount amount is:"+da);
		System.out.println("The discounted price is:"+dp	);
		
    }
}