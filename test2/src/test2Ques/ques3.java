package test2Ques;

public class ques3 {
	
	public static void LeaderInArr(int[] arr) {
		boolean check = true;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					check = false;
					break;
				}
				else {
					check = true;
				}
			}
			if(check) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
