import java.util.ArrayList;

public class BasicList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (Integer j = 10; j <= 100; j = j + 10) {
			list.add(i);
		}

		System.out.println(list);
		System.out.println("Size of the list is " + list.size());

		myList.add(myList.size() / 2, 200);

		System.out.println(myList);
		System.out.println("Size of the list is " + list.size());
		System.out.println("Value 200 is located at index " + list.indexOf(200));

	}

}
