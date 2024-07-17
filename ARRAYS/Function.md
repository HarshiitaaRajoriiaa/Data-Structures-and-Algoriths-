
```java
int arr[] = { 1,2,3};

// arr to String
Arrays.toString(arr);

// sort Array
Array.sort(arr); 
 
// fill whole array with value !
Arrays.fill(arr1 , 1  );//value to fill 

// bunch of char into array
char[] chars = "hello".toCharArray();

// boolean == equality of two arrays
Arrays.equals( arr1 , chars );

// arr2 is copy of arr with different address references.
int arr2[] = Arrays.copyOf(arr );

//another way
int arr2[] = arr1; // that hexadecimal no is passed to arr2 ( address value )

// search any number
int[] numbers = {1, 3, 4, 5, 7};
int index = Arrays.binarySearch(numbers, 4);

// array into array list:
String[] words = {"Java", "is", "awesome"};
List<String> list = Arrays.asList(words);

// sub array from any range
int[] copy = Arrays.copyOfRange(numbers, 1, 4);

//comparison lexigraphically
compare(array 1, array 2)	

//Finds and returns the index of the first unmatched element between the two specified arrays.
mismatch(array1, array2) 	
```