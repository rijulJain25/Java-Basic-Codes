/*QUESTION:
Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000
*/

package Ques;

import java.util.Arrays;

public class Ques2 {
	
	public static int MaxProfit(int arr[]) {
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			max = Math.max(max, arr[i]*arr.length-i);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
