
package Questions;

import java.util.Scanner;

public class checkArmstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int cnt = 0;
		int arm = 0;
		int a = n;
		int b = n;
		if(n >= 0 && n <= 9) {
			System.out.println(true);
			return;
		}
		while(a>0) {
			a = a/10;
			cnt++;
		}
		while(b>0) {
			int rem = b%10;
			arm += Math.pow(rem, cnt);
			b = b/10;
		}
		if(arm == n) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
	}
}
