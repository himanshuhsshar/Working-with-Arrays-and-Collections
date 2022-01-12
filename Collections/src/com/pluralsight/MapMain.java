package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

	public static void main(String... args) {
		HashMap countries = new HashMap();
		HashMap<Integer, String> countries2 = new HashMap<>();
		Map languages = new HashMap();
		Map<String, String> languages2 = new HashMap<>();
		
		countries2.put(840, "USA");
        countries2.put(484, "MEX");
        countries2.put(124, "CAN");

        System.out.println(countries2.get(840));

        System.out.println(countries2.remove(840));
        
        System.out.println(countries2.keySet());

        System.out.println(countries2.put(124, "CAN"));
        System.out.println(countries2.put(124, "ABC"));

        System.out.println(countries2.values());

        System.out.println(countries2.containsKey(840));
        System.out.println(countries2.containsValue("USA"));

        countries2.put(-1, null);
        countries2.put(null, null);
        System.out.println(countries2);
        
        TreeMap<Integer, String> planets = new TreeMap<>();
        Map<String, String> englishSpanish = new TreeMap<>();

        planets.put(3, "Earth");
        planets.put(2, "Venus");
        planets.put(4, "Mars");

        planets.put(Integer.valueOf(3), "Earth");

        englishSpanish.put("dog", "perro");
        englishSpanish.put("cat", "gato");
        englishSpanish.put("fish", "pez");

        System.out.println(planets.keySet());
        System.out.println(englishSpanish.keySet().toString());

        planets.put(20, null);
        System.out.println(planets);
        System.out.println(englishSpanish);
        //planets.put(null, null);


	}

}
