Overview:
This program implements generic sorting algorithms in Java for an array of strings and an array of Quadratic objects.
The sorting algorithms implemented are Insertion Sort and Selection Sort. The program uses generics and ensures that
the objects being sorted implement the Comparable interface and also implements a test program to test the sorting.

Instructions:
Assuming that JDK is installed on your machine, follow the steps below to run the program:
Compile the java files by running the command: javac Q4/*.java
Run the test program by running the command: java Q4.SortTest

Results:
The program successfully sorts an array of strings using both the Insertion Sort and Selection Sort algorithms.
The program also throws a compilation error when attempting to sort an array of Quadratic objects since the Quadratic
class does not implement the Comparable interface. To see the specific error, uncomment the line 22 in the test program.

Known Bugs:
There are no known bugs at this time.