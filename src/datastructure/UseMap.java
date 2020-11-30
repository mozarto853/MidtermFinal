package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		List<String> veganFood = new ArrayList<String>();
		veganFood.add("Oreos");
		veganFood.add("Pringles");
		veganFood.add("Humus");

		List<String> fattyFoods = new ArrayList<String>();
		fattyFoods.add("Burger");
		fattyFoods.add("Fried Chicken");
		fattyFoods.add("Pizza");

		Map<String,List<String>> map = new HashMap<>();
		map.put("High Calorie Foods",fattyFoods);
		map.put("Healthy food",veganFood);



		String i = "";
		for(Map.Entry<String, List<String>> food : map.entrySet()){
			i += food.getKey() + food.getValue();
		}

		System.out.println("\nWhile with Iterator");
		Iterator<Map.Entry<String,List<String>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry = iterator.next();
			System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());
		}

	}

}
