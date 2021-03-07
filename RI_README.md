# Reversing an integer

Let's consinder an number **66473**, reversed would be **37466**.

So, how would we reverse?

Let's consider the below scenario,

Our number is made of 5 integers, that is [6, 6, 4, 7 and 3]. Java doesn't have an API of getting individual integers. 
Unlike in a string, where we can use string.charAt(index).

But, let's have a loot at the below...

Case1: **66473 % 10 = 3**
Case2: **66473 / 10 = 6647**

So, we are able to get the last integer and also the resultant number after getting rid of the last integer.

That is fantastic... let's consider the below snippet

```java
    int n = 0;
		while (num != 0) {
			n = num % 10;
			num = num / 10;
			System.out.println("n is " + n + " and num is " + num);
		}
```

The output is

```java
n is 3 and num is 6647
n is 7 and num is 664
n is 4 and num is 66
n is 6 and num is 6
n is 6 and num is 0
```

It looks like we will easily reverse the number...


Let's consider the below snippet

```java
private static int reverse(int input) {//line 1
		long reversed = 0;//line 2
		while (input != 0) {//line 3
			reversed = reversed * 10 + input % 10;//line 4
			input /= 10;//line 5
			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {//line 6
				throw new Error("Reversed exceeded allowed int range");//line 7
			}
		}
		return (int) reversed;//line 8
	}
```

The most important lines are 4 and 5.

Line 4, we are getting the last integer from our number. That is **input%10**, then adding previous reversed number.

We multiply by 10 for abvious reasons. Initially, **reversed = 0** and last integer is **3**

So, **reversed = 0*10 + 3, which is 3** and input is **6647**, let see our second loop.

We will get **reversed = 3*10 + 7, which is 37**, our input will be **664**

As you can see, our number is reversing, at the end of the loop we will have a reversed number.

But, why line 6? 

At times, we might reverse an interger and end up exceeding the allowed range. 

Let's see our third loop.

We will get **reversed = 37*10 + 4, which is 374**, our input now is 66.

Forth loop,

**reversed = 374*10 + 6, which is 3746**, our input is 8

Fifth loop,

**reversed = 3746*10 + 6 which is 37466**, input is noe zero.

Recall, our number was **66473** and we got **37466**.

Wow! we did it!

