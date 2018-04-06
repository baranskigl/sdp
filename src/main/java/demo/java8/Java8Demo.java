package demo.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Demo {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Bartek");
		names.add("Michal");
		names.add("Patryk");
		names.add("Bogdan");

		// case1 - print all names
		// before Java 8
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		for (String name : names) {
			System.out.println(name);
		}

		// Java 8 collection streaming
		names.stream().forEach(name -> System.out.println(name));

		// case2 - print only names with first letter B and make them uppercase
		// before Java 8
		for (String name : names) {
			if (name.startsWith("B")) {
				System.out.println(name.toUpperCase());
			}
		}

		// Java 8 collection streaming
		names.stream().filter(p -> p.startsWith("B")).forEach(p -> {
			System.out.println(p.toUpperCase());
		});

	}

}