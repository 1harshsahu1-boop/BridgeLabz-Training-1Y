import java.util.Scanner;
class inches_cm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double cm = scanner.nextDouble();
        double inches = (cm/2.54);
        double feet = (inches / 12);
        System.out.println("Your height is: "+inches+"inches");
		System.out.println("Your height is: "+feet+"feet");
    }
}
