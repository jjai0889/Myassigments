package Week3.Day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * Input: babu
		// * Output: a u

		String input = "babu";
		char[] ch = input.toCharArray();

		Set<Character> unique = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			if (!unique.contains(ch[i])) {
				unique.add(ch[i]);
			}

			else {
				unique.remove(ch[i]);

			}

		}

		System.out.println(unique);

	}

}
