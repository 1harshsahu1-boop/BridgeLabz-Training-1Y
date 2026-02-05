import java.util.Scanner;
class fizzbuzz{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n=sc.nextInt();
		String[] result = new String[n];
		for (int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				result[i-1]="Fizzbuzz";
			} else if (i%3==0) {
                result[i-1] = "Fizz";
            } else if (i%5==0) {
                result[i-1] = "Buzz";
            } else {
                result[i-1] = String.valueOf(i);
            }
        }
		for (int i = 0; i < n; i++) {
            System.out.println("Position " + (i + 1) + "=" + result[i]);
			}
		}
	}
}