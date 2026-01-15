import java.util.Scanner;
class inventary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of product:");
        int a=sc.nextInt();
        System.out.print("Enter the no. of pieces:");
        int b=sc.nextInt();
        int pri=a*b;
        System.out.println("The total purchase price is:"+pri);
    }
}