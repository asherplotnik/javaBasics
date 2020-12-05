package collections;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.List;
import java.util.Set;


public class Lists {
	
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < 10 ) {
			set.add((int)(Math.random()*10));		
		}
		
		System.out.println(set);
			
	}

}
