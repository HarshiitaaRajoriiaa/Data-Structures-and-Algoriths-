### List of approaches i used while encountering the problems:
 * 1. Sum of digits of any integer: 
    number%10 = last digit of number
    number/10 = give digit with removed last digit
*  2. Digital Root: This means that for any integer, the remainder when it is divided by 9 is the same as the remainder when the sum of its digits is divided by 9.
```java
    General formula = sum = 1 + (n-1)%9
    example = 38mod9 = 11mod9 = 2
```
    i. if n%9==0 then sum of digits = 9 / 1+8 = 9, 3+6 = 9, 2+7 = 9...... 
    ii. if n%9!=0 then sum of digits until one digit is left = 199%9 = 1

* 3. Prime numbers:
    i. 1 is non-prime and non-composite integer
    ii.2 is only even and left are odd prime integer
    iii.Every even positive integer greater than 2 can be expressed as the sum of two primes.
    iv. Every prime number can be represented in form of 6n + 1 or 6n – 1 except the prime numbers 2 and 3, where n is any natural number.
    5=6(1)-1 , 7 = 6(1)-1..........

* 4.  Euclidean algorithm:The key idea is that:
``` java
gcd(a,b)=gcd(b,a%b). 
```
This means that the GCD(two numbers) is the same as the GCD( the smaller number and the remainder when the larger number is divided by the smaller number).
        {gfg/gcd.java}

* 5. PAIR IN JAVA:
```JAVA
Pair<Integer , Integer> pair = new Pair<> ();
```
6. Approach to answer question:

    always try to grab all the piece of information is given in the question and should consider every info.

7.  any integer can be expressed as one of the following forms: 6n,6n+1,6n+2,6n+3,6n+4,or 6n+5