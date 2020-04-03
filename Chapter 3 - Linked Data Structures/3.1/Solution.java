/* Chapter 3.1  */

package delete;

public class Solution {
	public static void main(String[] args) {
		int [] a = {33, 55, 77, 99, 77, 55, 33, 0};
		delete(a, 6, 55);
	}
	
	// delete: Deletes first occurrence of number in an array
	public static void delete(int[] a, int n, int x) {
		for(int temp: a) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		// precondition: 0 <= n a.length
		// postcondition: the first occurrence of x among {a[0],...,a[n-1] jas been deleted
		int i = 0;
		// Sets variable to the first location of 55 in the array -- 2nd element
		while(i < n && a[i] <= x) {
			++i;
		}
		// Shift every thing from element larger then 2, down one
		System.arraycopy(a, i, a, i - 1, n);
		
		for(int j: a) {
			System.out.println(j);
		}
		
		
	}

}
