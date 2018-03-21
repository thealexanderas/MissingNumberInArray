import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class MissingNumberInArrayDinamicaly {

	public static void main(String[] args) {
		String number;
		int arrayValue;
		
		// Define the Array Length ( Dynamically )
		String length = JOptionPane.showInputDialog("Insert array length");
		// Convert input from string to integer
		int arrayLength = Integer.parseInt(length);
		// Define array of length defined in previous input
		int [] array = new int[arrayLength];
		// Counter to reach the maximum legnth
		int counter = 0;
		// Current index of procession
		int index = 0;
		
		// Do N times - defined on first input
		do {
			 index ++;
			 number = JOptionPane.showInputDialog(String.format("Insert number at index %d", index));
			 arrayValue = Integer.parseInt(number);
			 
			 // Store value in Array
			 array[counter] = arrayValue;
			 counter++;
			 
			 // Exit when reach the full length
		} while (counter < arrayLength);
		
		
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
