package Week3.Day2Assignment;


import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = ("PayPal India");
		

		char[] ch = str.toCharArray();
		
		

		Set<Character> company = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			company.add(ch[i]);
			
		}
		
		System.out.println(company);

		

		

	}

}
