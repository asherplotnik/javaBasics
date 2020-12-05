package collectionsHome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class List1 {
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(8);
		list.add(9);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.get(0)+list.get(1)+list.get(2));
		System.out.println((list.get(0)+list.get(1)+list.get(2))/3.0);
		
		list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add((int)(Math.random()*61)+20);
		}
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.size()-1);
		System.out.println(list.get(9));
		
		//for (int i = 0; i < list.size();i++) { 
		//  if (list.get(i) == 25) {
		//	  System.out.println("NUMBER 25 is in index: "+ i); 
		//  } 
		//}
		 
		
		if (list.contains(25)) {
			System.out.println("NUMBER 25 is in index: "+ list.indexOf(25));
		}
		
		list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*6)+5);
		}
		System.out.println(list);
		Set<Integer> set  = new LinkedHashSet<>(list);
		System.out.println(set);
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("yosi");
		set2.add("ran");
		set2.add("dan");
		System.out.println(set2);
		Iterator<String> it = set2.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if(!it.hasNext()) {
				System.out.println("Last name : "+ name);
			}
		}
		set = new LinkedHashSet<>();
		while (set.size() < 10) {
			set.add((int)(Math.random()*11));
		}
		System.out.println(set);
		Iterator<Integer> it2 = set.iterator();
		while (it2.hasNext()) {
			Integer num = it2.next();
			if(num % 2 == 0) {
				it2.remove();
			}
		}
		System.out.println(set);
	}
	
	
}
