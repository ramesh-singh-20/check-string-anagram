# check-string-anagram
This repository implements code to check if two strings are anagrams or not.

**Method 1**

In this we are discarding if any of the strings are null or if strings are of different lengths.

We are converting both strings to lowercase and then sorting and checking if Arrays are equal, if equal then strings are anagrams else not.


**Method 2**

In the second method, we are discarding if any of the strings are null or if strings are of different lengths.

Then we are creating one int array with 256 length to accommodate ASCII characters. If any character is found in string s1 then we will increment that location and if found in seecond string we will decrement.

Then we will check count array again to see all are zero.


