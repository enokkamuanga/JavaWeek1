package enokkamuanga;

import java.util.*;

public class Hashmaps {

	public static void main(String args[]) {

		// Create a hash map
		HashMap hm = new HashMap();

		// Put elements to the map
		hm.put("Neymar", new Double(3434.34));
		hm.put("Messi", new Double(123.22));
		hm.put("Suarez", new Double(1378.00));
		hm.put("Busquets", new Double(99.22));
		hm.put("Rakitic", new Double(-19.08));

		// Get a set of the entries
		Set set = hm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = ((Double) hm.get("Suarez")).doubleValue();
		hm.put("Suarez", new Double(balance + 1000));
		System.out.println("Suarez's new balance: " + hm.get("Suarez"));
	}
}