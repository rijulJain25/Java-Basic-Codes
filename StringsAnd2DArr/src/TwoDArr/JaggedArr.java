package TwoDArr;

public class JaggedArr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		
//		it will print the address of 2D array
		System.out.println(arr);
		
		int[][] arr2 = new int[4][];
		System.out.println(arr2);
		
//		it will give an error because there is no column stored
//		System.out.println(arr2[0][0]);
		
//		jagged array structure:
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = new int[i+2];
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println();

	}
}
