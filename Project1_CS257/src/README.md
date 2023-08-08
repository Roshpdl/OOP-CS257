# Roshan Poudel - Project 1
### CS 257 - Object Oriented Programming

---
**PART 1**

The following classes contain methods that perform various operations on integer arrays and Integer ArrayList.

For information on the methods, please refer to the javadoc comments in the source code.

**Class: ArrayUtils.java**

**Class: ArrayListUtils.java**

### The testing of the methods in the above classes is done using the "ArrayUtilsTester.java" class.

To test on methods present in the above two classes, run the following command:

`javac ArrayUtilsTester.java`

`java ArrayUtilsTester `

The results of the test are stored in the ["results.txt"](results.txt) file.

---

**PART 2**

The following class contains the implementation of the rail cipher encryption and decryption.

For information on the methods, please refer to the javadoc comments in the source code.

**Class: RailCipher.java**

To run the RailCipher class, run the following command:

`javac RailCipher.java`

`java RailCipher`

This program will ask you for an input string to encrypt and will then print the encrypted and decrypted string.

### Following are the test cases for the RailCipher class:

**Test Case 1:** Original test case
> Input: "BEWARE THE IDES OF MARCH"
> 
> Encoded Format:
> 
> BWRTE DSFAC EAEHI EOMRH 
> 
> Decoded String:
> 
> BEWARETHEIDESOFMARCH

**Test Case 2:** Test case for string with all uppercase letters
> Input: "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
> 
> Encoded Format:
> 
> TEUCB ONOJM SVRHL ZDGHQ IKRWF XUPOE TEAYO
> 
> Decoded String:
> 
> THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG

**Test Case 3:** Test case for string with spaces
> Input: "Hello World!"
> 
> Encoded Format:
> 
> Hlool !elWr d
> 
> Decoded String:
> 
> HelloWorld!

**Test Case 4:** Test case for string with no spaces
> Input: "Thisisateststring"
> 
> Encoded Format:
> 
> Tiiae ttigh sstss rn 
> 
> Decoded String:
> 
> Thisisateststring

**Test Case 5:** Test case for empty string
> Input: ""
> 
> Encoded Format:
> 
> 
> Decoded String:











