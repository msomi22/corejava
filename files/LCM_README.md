# LCM Solution

## Common terms

### Least Common Multiple
### Lowest Common Multiple 
### Least Common Denominator
### Smallest Common Multiple

LCM of n numbers is the least positive number that can be divided by both the numbers, without leaving the remainder. 

Recall that a factor of n numbers is a number that can divide the numbers without a remainder.

What about a multiple?

A multiple is a number that can be divided by another number a certain number of times without a remainder. A factor is one of two or more numbers that divides a given number without a remainder.

We are good?

See the below

```
lcm(a,b) = (a*b)/ gcd(a,b)
gcd(a,b) = (a*b)/ lcm(a,b)

```

Let's now consinder the below code,

```java
static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	static int lcm(int a,int b) {
		return (a*b)/gcd(a,b);
	}
```

[Go Back](https://github.com/msomi22/corejava)

