import java.util.Arrays;

class printarray {
    public static void main(String...args) {
        int[] arr = new int[5];
		arr[0]=78;
		arr[1]=64;
		arr[2]=108;
		arr[3]=42;
		arr[4]=91;
		System.out.println("Printing array with tostring");
        System.out.println(Arrays.toString(arr));
		System.out.println("Length of of array:-");
		System.out.println(arr.length);
		
    }
}

