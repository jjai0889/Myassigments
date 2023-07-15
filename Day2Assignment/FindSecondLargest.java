package Week3.Day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		// 3,2,11,4,6,7,2,3,3,6,7

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// Output= 5,9

		// a) Create a empty Set Using TreeSet

		Set<Integer> large = new TreeSet<>();

		for (int i = 0; i < data.length; i++) {

			large.add(data[i]);
		}

		List<Integer> list = new ArrayList<>(large);

		//Collections.sort(list);

		Integer integer = list.get(list.size() - 2);

		System.out.println(integer);

	}

}
