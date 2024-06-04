package arrays;

public class InsertElement {
	public static void main(String[] args) {

		int[] a = { 3, 6, 9, 3, 6, 9, 1, 8 };
		int n = a.length;
		int pos= 6;
		int element= 1; //// Position to insert (1-based index)
		
		// Create new array with one additional length
		int[] a1 = new int[n+1];
		
		// Copy elements up to the position
        for (int i = 0; i < pos - 1; i++) {
            a1[i] = a[i];
        }
		
		// Insert the new element
		a1[pos - 1] = element;
		
		// Copy the remaining elements
        for (int i = pos- 1; i < n; i++) {
            a1[i + 1] = a[i];
        }

		// Print the new array
		for (int  i = 0; i <  a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
