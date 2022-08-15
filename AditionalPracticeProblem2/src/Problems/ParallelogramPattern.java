package Problems;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i< n; i++){
            for(int j = 0; j <= i-1; j++){
                if(i != 0){
                    System.out.print(" ");
                }
            }
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
