package sorting;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {

		{// others are sorted by its natural order
			List<Person> list = new ArrayList<>();
			list.add(new Person(103, "aaa", 55));
			list.add(new Person(101, "ccc", 22));
			list.add(new Person(102, "bbb", 33));

			// insert order
			System.out.println(list);

			// natural order - id
			list.sort(null);
			System.out.println(list);

			// other order - name
			AgeComperator ageComparator = new AgeComperator();
			list.sort(ageComparator);
			System.out.println(list);
			PersonNameComparator nameComperator = new PersonNameComparator();
			list.sort(nameComperator);
			System.out.println(list);
		}

	}

}