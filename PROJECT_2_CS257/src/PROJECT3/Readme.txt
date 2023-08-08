Project Name: Project 3
Author: Roshan Poudel
Date: 04/13/2023
Course: CS 257, Spring 2023

This project is a simple Java Swing application that displays a bar chart representing precipitation data. The chart
is displayed in a JFrame window with a title label and a chart component that shows bars representing precipitation
amounts.

How to Build and Run the Program:

Prerequisites:

Java Development Kit (JDK) installed on your system.
Open the project in your IDE, or navigate to the project directory in your terminal/command prompt.

Build the project by compiling the Java source files. If using an IDE, you can build the project by selecting the
"Build" or "Compile" option. If using the terminal/command prompt, you can use the "javac" command followed by the
name of the source file. For e.g. if you are in the src directory: typing this would compile all the java classes
in package PROJECT_3 "javac ./PROJECT3/*.java"

Once the project is successfully compiled, you can run the program by executing the main class "ChartViewer".
If using an IDE, you can run the program by selecting the "Run" option for the main class.
If using the terminal/command prompt, you can use the "java" command followed by the name of the main class.
For e.g. "java PROJECT3.ChartViewer"

IMPORTANT TO KNOW:
1. There are two constructors for PrecipList.java class. One takes no arguments and uses the absolute filepath
(you may need to change this filepath to match your system) to the data file. The other constructor takes a String argument
which is also the absolute path to the data file.You can use either of these constructors to create an instance of
the PrecipList class.

2.The data file is named "precip.txt" and is located in the PROJECT3 package itself.

Known Issues and Bugs:

The program throws FileNotFoundException if the absolute path of the data file is not specified in the constructor of
the ChartViewer class. However, you can try using the filename only and see if it works.

No other known issues or bugs at this time.