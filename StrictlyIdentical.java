/*
 * Sample run: 1 2 3 4 5 for list1 and 1 2 3 4 5 for list2 outputs "Two lists are strictly identical"
 */
package testjava;
import java.util.Arrays;
import java.util.Scanner;
public class StrictlyIdentical {
	
	public static boolean equals(int[] array1, int[] array2) // method that checks if array1 and array 2 are the same
	{
	if (Arrays.equals(array1, array2)){
	return true; //if equal, return true
	}
	else{
	return false; //if not equal, return false
	}
	
	}
	
	public static void main(String[] args) {
	//declare variables
	int list1[] = new int[5];
	int list2[] = new int[5];
	
	//declare scanner
	Scanner in = new Scanner(System.in);

	//prompt user to enter 5 elements for list1
	System.out.print("Enter 5 elements of list1: ");
	for(int i=0; i<5; i++){
	list1[i] = in.nextInt();
	}

	//prompt user to enter 5 elements for list 2
	System.out.print("Enter 5 elements of list2: ");
	for(int j=0; j<5; j++){
	list2[j] = in.nextInt();
	}

	//call method
	StrictlyIdentical ob=new StrictlyIdentical();
	boolean result=ob.equals(list1, list2);
	
	if(result){ //say arrays are identical if method returns true
	System.out.println("Two lists are strictly identical.");
	}
	else{ //say arrays are not identical if method returns false
	System.out.println("Two lists are not strictly identical.");
	
	}
	
	}
	
}