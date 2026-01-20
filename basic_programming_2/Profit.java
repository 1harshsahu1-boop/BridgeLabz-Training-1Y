import java.util.Scanner;
class profit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price:");
        int c=sc.nextInt();
        System.out.print("Enter selling price:");
        int s=sc.nextInt();
        int profit=(s-c);
		int proper=(profit*100/c);
        System.out.println("The profit is:"+profit);
		System.out.println("The profit percentage is:"+proper+"%");
    }
}