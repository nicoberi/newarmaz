package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("watermalone");
		fruits.add("currant");
		fruits.add("apple");
		System.out.println(fruits + "ArrayList");
		
		List<Integer> numbers = new LinkedList();
		numbers.add(25);
		numbers.add(54);
		numbers.add(76);
		numbers.add(77);
		System.out.println(numbers + "LinkedList");
		
		Set<String> fruits2 = new HashSet<>();
		fruits2.add("apple");
		fruits2.add("watermalone");
		fruits2.add("currant");
		fruits2.add("apple");
		System.out.println(fruits2 + "HashSet");
		
		Set<String> fruits3 = new LinkedHashSet<>();
		fruits3.add("apple");
		fruits3.add("watermalone");
		fruits3.add("currant");
		fruits3.add("apple");
		System.out.println(fruits3 + "LinkedHashSet");
		
		Set<String> fruits4 = new TreeSet<>();
		fruits4.add("apple");
		fruits4.add("watermalone");
		fruits4.add("currant");
		fruits4.add("apple");
		System.out.println(fruits4 + "TreeSet");
		
		Map<String, Integer> fruits5 = new HashMap<>();
		fruits5.put("apple", 2);
		fruits5.put("watermalone", 2);
		fruits5.put("currant", 5);
		fruits5.put("apple", 4);
		System.out.println(fruits5 + "HashMap");
		
		Map<String, Integer> fruits6 = new LinkedHashMap<>();
		fruits6.put("apple", 2);
		fruits6.put("watermalone", 2);
		fruits6.put("currant", 5);
		System.out.println(fruits6 + "LinkedHashMap");
		
		Map<String, Integer> fruits7 = new TreeMap<>();
		fruits7.put("apple", 2);
		fruits7.put("watermalone", 2);
		fruits7.put("currant", 5);
		System.out.println(fruits7 + "TreeMap");
		
		
		
		
		

	}

}
