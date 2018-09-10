
import java.util.Scanner;
public class BinarySearchAndBubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [10];
		int i, temp;
		//Takes array elements as user input
		System.out.println("Enter Array Elements");
		
			for(i = 0; i < arr.length; i++)
			{
				arr [i] = input.nextInt(); 
			}
		//Sorts the array elements accending order (Bubble Sort)
		for (i = 0; i < arr.length-1; i++)
		{
			int j = 0;	
			while(j < arr.length-1-i)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				j++;
			}
		}

	//Binary Search Process starts here
	int start = 0;
	int end = arr.length-1;
	int mid = (start+end)/2;
	System.out.println("Enter a item to search");
	int item = input.nextInt();
	
	while(start<=end && arr[mid] != item)
	{
		if(item < arr[mid])
		{
			end = mid-1;
		}
		else {
			start = mid+1;
		}
		mid  = (start+end)/2;
	}
	
	for(i = 0; i < arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	if(item == arr[mid])
	{
		System.out.println("Item is found & the location is " + mid);
	}
	else {
		System.out.println("Item not found");
	}
		
	}

}
