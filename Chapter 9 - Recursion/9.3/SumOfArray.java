/* Chapter 9.3
 * Program returns the sum of the first n elements of an array
 */

package sumofarray;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int result = 0;
		System.out.print("Enter array size: ");
		n = input.nextInt();
		int [] arr = new int [n];
		fillArray(arr);
		print(arr);
		result = sum(arr, n - 1);
		System.out.println("\nThe sum of the array elements is: " + result);
		input.close();
	}
	
	/* fillArray: Array with random numbers */
	public static void fillArray(int arr []) {
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(1, 50);
		}
		System.out.println();
	}
	
	/* print: Print array contents */
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/* sum: Sum array elements (recursively) */
	public static int sum(int arr [], int n) {
		// BASE CASE: STOPPING CONDITION
		if(n == 0) {
			return arr[0];
		}
		return arr[n] + sum(arr, n - 1) ;
		
	}
	
}

	
