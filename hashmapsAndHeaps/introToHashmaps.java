package hashmapsAndHeaps;
import java.util.*;

public class introToHashmaps {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India", 135);
		hm.put("China", 200);
		hm.put("Pak", 40);
		hm.put("US", 30);
		hm.put("UK", 20);
		
		System.out.println(hm);
		
		hm.put("Nigeria", 5);
		hm.put("US", 20);
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		System.out.println(hm.get("Utopia"));
		
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("Utopia"));
		
		Set<String> keys =hm.keySet();
		System.out.println(keys);
		
		for(String key:hm.keySet()) {
			int val = hm.get(key);
			System.out.println(key+" "+val);
		}

	}

}
