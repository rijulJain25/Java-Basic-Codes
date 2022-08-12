
public class FindDuplicate {
	public static int DuplicateEle(int arr[]) {
		int maxSum = 0;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			maxSum = maxSum+i;
		}
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		int ans = maxSum - sum;
		return arr.length-ans-1;
	}
	public static void main(String[] args) {
		int arr[] = {0, 3, 1, 5, 4, 3, 2};
		System.out.print(DuplicateEle(arr));
	}
}
