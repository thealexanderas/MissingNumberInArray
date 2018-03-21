import java.text.Format;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MissingNumberInArray {

	public static void main (String args []){
		
		// Declaring array of integers with missing one number
		int [] array = { 2,3,1,5 };
		// Calculating the Array length considering the missing value ( + 1 )
		int size = array.length + 1;
		// Store missing number by calling the static method and passing actual values and array length
		int missingValue = findMissing(array, size);
		// Message printout to user
		JOptionPane.showMessageDialog(null, String.format("Missing value in the array is : %d ", 
									  missingValue));	
	}

	private static int findMissing(int[] array, int i) {
		
		int missingNumber = 0;
		// Initialize variable that stores the sum of existing numbers
		int sumFromArray = 0;
		// Calculate maximum sum for "I" length array
		int expectedSum = (i*(i+1)/2);
		
		// Calculate sum from each number in array
		for(int a : array){
			sumFromArray = sumFromArray + a;
		}
		// Return missing value by division of expected and actual sum
		missingNumber = expectedSum - sumFromArray;
		return missingNumber;
	}
}
