package Week3.Day2Assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums []= {1,2,3,4,5,6,8,9,10}; 
		
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 1; i < nums.length; i++) {
			
			set.add(nums[i]);
			
			if(i!=nums[i-1]) {
				
				System.out.println(i);
				
				break;
			}
			
		}
		

	}

}
