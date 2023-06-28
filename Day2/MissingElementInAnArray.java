package week1.Day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				
				// Sort the array
				
				Arrays.sort(arr);
				// 1,2,3,4,6,7,8
				
				System.out.println(arr);
				
				// check if the iterator variable is not equal to the array values respectively
				
				// print the number
				
				// once printed break the iteration
				
				for (int i = 1; i < arr.length; i++) {
					
					 if(i!=arr[i-1]) {
						 System.out.println(i);
						 // 1!= 1
						 // 2!= 2
						 // 3 !=3
						 // 4!= 4
						 // 5!= 6
						 
					  System.out.println(i);
					
					 break;
				}

	}

}
	
}
