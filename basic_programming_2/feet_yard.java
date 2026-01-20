import java.util.Scanner;
class feet_yard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in mile: ");
        double mile= scanner.nextDouble();
        double yard=1760*mile;
        double feet=yard*3;
        System.out.println("Your height is: "+yard+"yards");
		System.out.println("Your height is: "+feet+"feet");
    }
}
