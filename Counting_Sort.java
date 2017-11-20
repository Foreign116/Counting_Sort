
public class Counting_Sort {
	public static void main(String args[]) {
		//time: O(n+k)
		// you have to use integers
		// you have to use small inputs, like don't use 10^9 amount of integers kiddo 
		int a[] = new int[] { 3, 2, 1, 4, 6, 8, 0, 5, 3, 2 }; // n, input
		int answer[] = new int[10]; // answer at end
		int count[] = new int[9]; //k , count
		for (int i = 0; i < a.length; i++) {
			count[a[i]] += 1; // count how many there is for a certain integers
		}
		for (int i = 0; i < count.length; i++) {
			if (i != 0) {
				count[i] += count[i - 1]; // we now add count from left to right, this is for index for next transformation 
			}
		}
		for (int i = count.length - 1; i > 0; i--) {
			count[i] = count[i - 1]; // these are the exact indices for the integers , shift from left to right 
		}
		count[0] = 0;
		for (int i = 0; i < a.length; i++) {
			answer[count[a[i]]] = a[i]; // getting index and setting number to where it belongs 
			count[a[i]]++; // increment index to use for next time this number appears 
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]); // printing out answer 
		}

	}
}
