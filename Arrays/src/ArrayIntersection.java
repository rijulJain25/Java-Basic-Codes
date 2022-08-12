
public class ArrayIntersection {
	public static void Intersection(int arr1[], int arr2[]) {
		if(arr1.length == 0 || arr2.length == 0) {
			return;
		}
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr2[j] == arr1[i]) {
					System.out.print(arr1[i]+" ");
					arr2[j] = -10000;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr1[] = {2,6,8,5,4,3,2};
		int arr2[] = {2,3,4,7,2};
		Intersection(arr1, arr2);
	}
}
