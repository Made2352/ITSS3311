import java.util.Scanner;

public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Sample Run with ("23 55 31 2 10" & "23 55 31 2 10")
	 
		Enter 5 elements of list1: 23 55 31 2 10
		Enter 5 elements of list2: 23 55 31 2 10
		Two lists are strictly identical.
		
		Sample Run with ("23 55 31 2 10" & "23 55 3 2 10")
		
		Enter 5 elements of list1: 23 55 31 2 10
		Enter 5 elements of list2: 23 55 3 2 10
		Two lists are not strictly identical.
		
		Sample Run with ("1 2 3 4 5" & "1 2 3 4 5")
		
		Enter 5 elements of list1: 1 2 3 4 5
		Enter 5 elements of list2: 1 2 3 4 5
		Two lists are strictly identical.
	*/
		
	//	Program Prompts Users to enter integer values twice with size 5 and displays whether it is equal or not
		
	
	//Declaring two arrays with data type int and size 5
		
		Scanner input = new Scanner(System.in);
		
		int [] list1 = new int [5];
		int [] list2 = new int [5];
		
	
	//Prompt user to enter 5 integer values and using a loop to store those numbers into the two arrays
	
		System.out.print("Enter 5 elements of list1: ");
		
		for (int i = 0; i < list1.length; i++)
		{
			list1[i] = input.nextInt(); 
		}
		
		
		System.out.print("Enter 5 elements of list2: ");
		
		for (int i = 0; i < list2.length; i++)
		{
			list2[i] = input.nextInt();
		}
		
	
	//Invoke a boolean method equals to pass the two arrays. If the return type is true will return "strictly identical" otherwise return "not strictly identical"	
		
		if(equals(list1,list2)) {
			System.out.println("Two lists are strictly identical.");
		} else {
			System.out.println("Two lists are not strictly identical.");
		}
		
	}

	
	//Create a boolean method equals with a for loop to check whether the two arrays are strictly identical or not, return to if-else statement in main method
	
	public static boolean equals(int[]list1, int[]list2) {
				
			for (int i = 0; i < list1.length; i++)
				{
					if (list1[i] != list2[i]) {
						return false;
					} else {
				}
		}
				return true;
	}
		
}
