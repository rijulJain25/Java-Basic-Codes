import java.io.IOException;
public class ArrangNumInArr {
	public static void Arranging(int arr[], int n) {
		int left = 0;
		int right = n-1;
		int count = 1;
		while(left <= right) {
			if(count%2 != 0) {
				arr[left] = count;
				count++;
				left++;
			}
			else {
				arr[right] = count;
				count++;
				right--;
			}
		}
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {3,4,1,7,6,5,2};
		int n = arr.length;
		Arranging(arr, n);
	}
}
