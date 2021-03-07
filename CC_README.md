# Counter character occurence in s string

Let's consider the below code

```java

import java.util.HashSet;
import java.util.Set;

public class CharOccurence {
	
	static final int ASCII_UPPER_LIMIT = 256;

	public static void main(String[] args) {
	
		String s = "Peter";
		occurence(s);

	}
	
	private static void occurence(String s) {
		System.out.println("=========== " + s);
		int[] counter = new int[ASCII_UPPER_LIMIT];
		for(int i=0;i<s.length();i++) {
			//System.out.println(i + "====" + (int)s.charAt(i) + " == " + s.charAt(i));
			counter[s.charAt(i)]++;//increment value at the particular index
			/**
			 * for instance,
			 * P == 80, at index 80, we increment the value from zero to 1.
			 * e == 101, we increment twice to 2.
			 */
		}
		/**
		 * now we have a big array with a lot of zero values, and we only want the 
		 * count of the specific characters.
		 * 
		 * So we need another array
		 */
		//System.out.println(Arrays.toString(counter)); 
		Set<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			if(set.add(c)) {
				System.out.println("Occurence of  " + c + " == " + counter[c]); 
			}
			
		}
		
		
	}

}

```

Output is 

```java
Occurence of  P == 1
Occurence of  e == 2
Occurence of  t == 1
Occurence of  r == 1
```
