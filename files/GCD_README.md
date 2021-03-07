# GCD Calculator 
## Related terms
### Greatest/Highest Common Divisor
### Greatest/Highest Common Mutiple
### Greatest/Highest Common Factor

Let's consider two numbers **30 and 45**

Below are factors/multiples of the two numbers. Basically, numbers that can divind the two without a remainder.

- 1, 2, 3, 5 and 15

So the GCD is 15

The key concept is that the number we are looking for should devind the given two numbers without a remainder.

**That means num1%target == 0 && num2%target == 0**

If we are looping in range of **0 > target or target < either_of_the_numbers**

Then the largent number that gives us zero for the two numbers is the GCD. 

Below is a GCD method - this is recursion and it is my favourite. 

```java
static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
```


See the below Sample code too. 
 
```java

public class GCD {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 45;
		int gcd = 1;

		/**
		 * 
		 */

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}

		System.out.println("GCD = " + gcd);

		/**
		 * 
		 */

		while (num1 != num2) {
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}

		System.out.println("GCD = " + num2);

		int arr[] = { 2, 4, 6, 8, 16 };
		System.out.println(findGCD(arr));
	}

	/*
	 * gcd(a->10,b->20)
	 * a != 0
	 * b%a = 20%10 = 0
	 * gcd(a->0,b->10)
	 * a==0 return 10
	 * 
	 * 
	 * 
	 * gcd(a->20,b->10)
	 * a != 0
	 * a= 10%20 = 10
	 * gcd(a->10,b->20)
	 * a != 0
	 * a = 20%10 = 0
	 * gcd(0,10)
	 * return 10
	 * 
	 * gcd(30,45)
	 * a != 0
	 * a = 45%30=15
	 * gcd(15,30)
	 * a != 0
	 * a= 30%15 = 0
	 * gcd(0,15)
	 * return 15
	 * 
	 */
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	static int findGCD(int arr[]) {
		int result = arr[0];
		for (int i = 1; i < arr.length; i++)
			result = gcd(arr[i], result);

		return result;
	}

}

```

[Go Back] (https://github.com/msomi22/corejava) 
