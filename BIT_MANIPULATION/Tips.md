## Tips for solving Bit and Bit Manipulation Problems:
1. __check whether the A is odd or not__
``` java
if(A & 1 == 1) bit = odd;
if(A & 1 == 0) bit= even ;
```
2. __set i bit to 1 / if i bit is 1 do nothing else set it to 1__
``` java
 return A || (1 <<i)
```
3. __set last set bit to 0  / example 101100 to 101000__
``` java
return A & A-1
```
### TIP:
- __if u need to subtract 1 from any number ends with 0 like 101100__
``` java
1 0 1 1 0 0 
        -1 
-----------
1 0 1 0 1 1
```
* you do take first set bit from right do AND of those set and bit along with trailing zeroes , and here you get the answer
4. __Count set bits__
* run a while loop get ride of last bit until length >0 and increment the count of bits.
5. __find if binary number is power of 2 or not?__
* if there is only one set bit in the number.
``` java
if((A & A-1)==0) return true;
```



