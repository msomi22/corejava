# Core Java - String reverse via recusrion.

Hello,

We are going to learn various sting manuplation functionalities in Java.

To start with, we will learn String reversing using recursion.

Let's hit the ground running.

Given a string literal "peter", let's see how we can do a reverse using resursion.

The resersed string will be "retep".

For better understanding, consinder the below snippet.
```
private static stringReserse(String s){
  if(s.isEmpty()){
    return s;
  }
  return stringReverse(s.subString(1)) + s.charAt(0)
}
```
