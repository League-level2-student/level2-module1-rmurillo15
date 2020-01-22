package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		
		ArrayList<String> strings = new ArrayList<String>();
		
		//   Don't forget to import the ArrayList class
		String c = "catwoman";
		if(c.contains("car")==true) {
			System.out.println("SDGSDGSDGDSGSDGDSG");
		}
		
		//2. Add five Strings to your list
		
		strings.add("nice");
		strings.add("yee");
		strings.add("what");
		strings.add("hmm");
		strings.add("go home");
		
		//3. Print all the Strings using a standard for-loop
	
		for (int i = 0; i < strings.size(); i++) {
			
			System.out.println(strings.get(i));
			
		}
		
		//4. Print all the Strings using a for-each loop
		for (String s : strings) {
			
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		
		for (int i = 0; i < strings.size(); i++) {
			
			if (i% 2== 0) {
				
				System.out.println(strings.get(i));
				
			}
			
		}
		
		//6. Print all the Strings in reverse order.
		
		for (int i = strings.size()-1; i >= 0; i--) {
			
			System.out.println(strings.get(i));
			
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		
		for (int i = 0; i < strings.size(); i++) {
			
		if (strings.contains("e") == true) {
				//System.out.println(strings.get(i));
		}
			
		}
		
		for (String ji : strings) {
			if (ji.contains("e") == true) {
				
				System.out.println(ji);
				
			}
		}
		
	}
}
