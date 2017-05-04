import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/* Given array is already sorted, and it has duplicate elements. 
 * Write a program to remove duplicate elements and return new array without any duplicate elements. 
 * The array should contain only unique elements.
 * Using collections
 */
public class removeDuplicatesFromSortedArray {
	

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(3);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(5);
		System.out.println("Non-unique Array list");
		System.out.println(array);
		System.out.println("Unique array list");
		removeDuplicates(array);
	}

	private static void removeDuplicates(ArrayList<Integer> array) {
		TreeSet<Integer> uniqueSet = new TreeSet<Integer>();
		uniqueSet.addAll(array);
		System.out.println(uniqueSet);		
	}

}
