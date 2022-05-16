package it.prova.provamap.test;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, Integer> mappaProva = new HashMap<String, Integer>();
		
		mappaProva.put("Uno", 1);
		mappaProva.put("Due", 2);
		mappaProva.put("Tre", 3);
		
		mappaProva.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		}

}

