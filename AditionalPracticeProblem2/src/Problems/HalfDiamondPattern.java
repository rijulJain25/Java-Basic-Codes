package Problems;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0){
            System.out.println("*");
            System.out.println("*");
            return;
        }
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= 0; j++){
                System.out.print("*");
            }
            for(int j = 1; j<= (2*i)-1; j++){
                if(j > i){
                    System.out.print((2*i)-j);
                }
                else{
                    System.out.print(j);
                }
            }
            for(int j = 2*i; j <= 2*i; j++){
                if(i !=0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = n-1; i >=0; i--){
            for(int j = 0; j <= 0; j++){
                System.out.print("*");
            }
            for(int j = 1; j<= (2*i)-1; j++){
                if(j > i){
                    System.out.print((2*i)-j);
                }
                else{
                    System.out.print(j);
                }
            }
            for(int j = 2*i; j <= 2*i; j++){
                if(i !=0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}

}
