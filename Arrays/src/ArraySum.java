import java.util.Scanner;

public class ArraySum {
	public static void ArrSum(int arr[]) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i< n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		ArrSum(arr);
		
	}
}
