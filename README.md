# Core Java - String reverse via recursion.

Dear reader,

We are going to learn various string manipulation techniques in Java.

To start with, we will learn String reversing using recursion.

Let's hit the ground running.

Given a string literal **Peter**, let's see how we can do a reverse.

The reversed string will be **reteP**.

For better understanding, consinder the below snippet.
```java
private static stringReverse(String s){ // line 1
  if(s.isEmpty()){ //line 2
    return s; //line 3
  }
  return stringReverse(s.subString(1)) + s.charAt(0) //line 4
}
```

Now, let's dissect the above code.

Step 1:<br />
     - The method is called with input **s** holding literal **Peter**.<br />
Step 2:<br />
     - We check whether the string **s** is empty and at this point it is not. So we skip line 3.<br />
Step 3:<br />
     - Line 4 is a very important.<br />
     - It has two parts,
     - Part 1 is a recursive call, i.e. **stringReverse(s.subString(1))** and part 2 which is getting character at index zero.
     - The two parts will execute separately starting with recursive call - part 1.
     - So, we have two parts, part 1 *stringReverse(s.subString(1))* and part 2 *s.charAt(0)*.
     - Part 1: We will do a recursive call, input will be substring(1) of **Peter**.
     - Substring(1) of **Peter** will give us **eter**, this will be our input to the *stringReverse* method in our first recursive call.
     - First recursion, line 1 and 2 will execute, line 3 will not since **s** is not empty.
     - Part 1 will execute and as explained, substring(1) of **eter** will return **ter**.
     - Our second recursion: input will be **ter**, line 1 and 2 will execute, still line 3 will not execute. 
     - Our third recursion: substring(1) of **ter** is **er**
     - Forth recursion: substring(1) of **er** is **r**
     - Fifth recursion: substring(1) of **r** will give us an empty string. 
     - Our condition at line 2 will be true and recursion will exit. So part 1 has completed it execution.
     - Let's see the summary of how part 1 executed. The **R** below stands for Recursion, that is recursion 1 to 5. 
     - input => Peter
     - R1 ====> eter
     - R2 ====> ter
     - R3 ====> er
     - R4 ====> r
     - R5 ====> exit recursion and retun control to part 2, this will start at R4.
     - Let's see how part 2 will execute.
     - So, recusrion ended and returned control to the second part with **s** having value **r**. 
     - R4 ====> charAt(0) of **r** is **r**
     - The above will return to R3, charAt(0) of **er** is **e**. So far we have **re**.
     - The above execution will return to R2, charAt(0) of **ter** is **t**. So far we have **ret**.
     - The above will return to R1, charAt(0) of **eter*** is **e**. So far we have **rete**.
     - The above will return to R0, charAt(0) of **Peter** is **P**. So we will have **reteP**.
     - Wow! we have reversed our string using recursion. 
