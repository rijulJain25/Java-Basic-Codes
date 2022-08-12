
public class TriplePairSum {
	public static int tripleSum(int arr[], int x) {
		int pair = 0;
        int n = arr.length;
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        pair++;
                    }
                }
            }
        }
        return pair;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, -5, 8, -6, 0, 5, 10, 11, -3};
		System.out.print(tripleSum(arr, 10));
	}
}
