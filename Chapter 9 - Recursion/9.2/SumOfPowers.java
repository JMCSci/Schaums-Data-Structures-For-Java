/* Chapter 9.2
 * Program finds the sum of the first n powers of a base
 * ex. 2^0 + 2^1 + 2^2 + ... + 2^n
 */

package sumofpowers;

import java.util.Scanner;

public class SumOfPowers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int base = 0;
		int result = 0;
		System.out.print("Enter a base value: ");
		base = input.nextInt();
		System.out.print("Enter a value for n: ");
		n = input.nextInt();
		result = solution(base, n);
		System.out.println("The sum of the first " + n + " powers of base " + base + " is: " + result);
		input.close();
	}
	
	public static int solution(int base, int n) {
		// BASE CONDITION -- STOPPING CONDITION
		if(n == 0) {
			return 1;
		}
		return (int) Math.pow(base, n) + solution(base, n - 1);
		
	}

}
