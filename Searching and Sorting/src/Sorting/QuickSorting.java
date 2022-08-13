package Sorting;

public class QuickSorting {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int str, int end) {
		int pivot = arr[end];
		int i = str-1;
		for(int j = str; j<end-1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, end);
		return i+1;
	}
	
	public static void QuickSort(int[] arr, int str, int end) {
		if(str<end) {
			int pi = partition(arr, str, end);
			QuickSort(arr, str, pi-1);
			QuickSort(arr, pi+1, end);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
