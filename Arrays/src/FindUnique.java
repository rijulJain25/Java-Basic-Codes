//#Finding the unique element from an array where all the elements are repeating and only one is not repeating and that is the answer


public class FindUnique {
	public static int UniqueElement(int arr[]) {
		int val = arr[0];
		for(int i = 1; i<arr.length; i++) {
			val = val^arr[i];
		}
		return val;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 6,2,6,23,7,4,2,7};
		System.out.print(UniqueElement(arr));
	}
}
