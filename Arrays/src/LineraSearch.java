import java.util.Scanner;

public class LineraSearch {
	public static int LinearSearch(int arr[], int k) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i< n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(LinearSearch(arr, k));
		
	}
}
