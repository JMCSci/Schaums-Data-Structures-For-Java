/* Chapter 9.1
 * Program returns the sum of the squares of the first n positive integers
 */

package sumofsquares;

import java.util.Scanner;

public class SumOfSquares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int result = 0;
		System.out.print("Enter a number: ");
		n = input.nextInt();
		result = solution(n);
		System.out.println("The sum of squares of the first " + n + " numbers is " + result);
		input.close();
	}
	
	public static int solution(int n) {
		// BASE CASE -- STOPPING CONDITION
		if(n == 1) {
			return n;
		} 
		return (int) (Math.pow(n,2) + solution(n - 1));
	}

}
