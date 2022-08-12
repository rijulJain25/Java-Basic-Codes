
public class SwapAlternate {
	public static void Swapping(int arr[]) {
		if(arr.length == 1) {
			System.out.print(arr[0]);
		}
		else if(arr.length == 0) {
			return;
		}
		for(int i = 0; i<arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {3,4,2,5,1,7,1,4};
		Swapping(arr);
	}
}
