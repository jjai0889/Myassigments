package Week3.Day2Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * a) Use the declared String text as input

		String text = "We learn java basics as part of java sessions in java week1";
        Set<String> unique = new LinkedHashSet<String>();

		// *Output= We learn java basics as part of sessions in week1
		
		String[] words = null;
		words = text.split(" ");
		
		//* b) Split the String based on white spaces and save as String Array ,Then
		// iterate the Array

		for (int i = 0; i < words.length; i++) {

			// * c) Create a empty Set

			unique.add(words[i]);

		}

		System.out.println(unique);

	}
}