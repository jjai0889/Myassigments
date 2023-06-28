package week1.Day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		           //0  1  2  3  4  5  6  7  8  9  10 11 12
		
		// get the length of the array
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(i);
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]);
				 System.out.println(arr[i]);
			}
			
		}

	}

}
