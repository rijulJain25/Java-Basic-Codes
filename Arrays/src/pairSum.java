
public class pairSum {
	public static int sumToX(int arr[], int x) {
		int pair = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == x) {
					pair++;
				}
			}
		}
		return pair;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
		System.out.print(sumToX(arr, 7));
	}
}
