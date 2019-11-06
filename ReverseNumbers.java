import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr [] = new int [10];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]= input.nextInt();
		}
		System.out.print("Original array: ");;
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Reverse: ");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
