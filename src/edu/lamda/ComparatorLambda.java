package edu.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String[] args) {
		Comparator<String> compLambda = (s1, s2) -> {
			return -Integer.compare(s1.length(), s2.length());
		};

		List<String> list = Arrays.asList("**", "*****", "*", "***");
		Collections.sort(list, compLambda);

		for (String s : list) {
			System.out.println(s);
		}
	}
}
