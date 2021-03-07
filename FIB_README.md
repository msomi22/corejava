# Fibonacci via recursion

## What is fibonacci?

Consinder the below sequence

**0,1,1,2,3,5,8,13...**

Okay, fibonacci is a sequence formed by adding previous two numbers to get the current number.

This starts with **0,1**

With the two numbers we are good to go.

**0+1=1** so the next number is **1**

We have **0,1,1**

**1+1=2** so our next number is **2**

So far, **0,1,1,2**

**1+2=3** so our sequence is **0,1,1,2,3** and so on.

Let's see a simple Java code via recursion.

I will try and explain how it works using fib(10) which is 55.


```java

public class Fibonacci {

	public static void main(String[] args) {

		int max = 10;
		System.out.println("Fibonacci Series of " + max + " numbers: ");
		for (int i = 0; i < max; i++) {
			//System.out.println("fib of "  + i + " = " + fibonacci(i) );
		}
		
		System.out.println(fibonacci(10));

	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	private static int fibonacci(int num) {
		if (num == 0)
			return 0;

		if (num == 1 || num == 2)
			return 1;
		
		/**
		 * fib(10) = 55
		 * fib(8) + fib(9) == 21+34=55
		 * 
		 * fib(9)
		 * fib(7) + fib(8) == 13+21=34
		 * 
		 * fib(8) 
		 * fib(6) + fib(7) == 8+13=21
		 * 
		 * fib(7)
		 * fib(5) + fib(6) == 5+8=13
		 * 
		 * fib(6)
		 * fib(4) + fib(5) == 3+5=8
		 * 
		 * fib(5)
		 * fib(3) + fib(4) == 2+3=5
		 * 
		 * fib(4)
		 * fib(2) + fib(3) == 1+2=3
		 * 
		 * fib(3) == 2
		 * fib(1) + fib(2)   == 1+1
		 * 
		 * 
		 */
		
		return  fibonacci(num - 2) + fibonacci(num - 1);
	}

}
```
