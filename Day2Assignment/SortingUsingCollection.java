package Week3.Day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> list = new ArrayList<String>();

		for (String company : str) {

			list.add(company);

		}

		Collections.sort(list);
		System.out.println(list);
		
		for (int i = list.size()-1; i>=0; i--) {
			
			System.out.println(list.get(i));
			
		}

	}

}
