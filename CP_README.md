# Calculate power of a number

Let's see the below snippet

```java

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(" 8 power 6 = 262,144");
		System.out.println(Math.pow(8, 6)); 
		System.out.println(power(8,6));
		
	}

	private static double power(int num, int p) {
		double result = 1;
		int i = p;
		/**
		 * We intent to achieve the following
		 * 
		 * (8*6) + (8*5) + (8*4) + (8*3) + (8*2) + (8*1)
		 */
		for(; i!=0; i--) {
			//System.out.println("i = " + i);
			result *= num;
			//System.out.println("result = " + result);
		}
		return result;
	}

	
}

```

output

```java
 8 power 6 = 262,144
262144.0
262144.0
```
