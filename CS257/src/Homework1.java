/**
 * Class Homework1 - Part 4 of Homework 1 for CS257
 * @author Roshan Poudel 2/2/06
 */

/* This program calculates the windchill for the given temperature and wind velocity */

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double temp; //air temperature in degrees Fahrenheit
        double velocity; //wind speed in miles per hour (mph)
        double windChill; //wind chill in degrees Fahrenheit

        System.out.print("Enter temperature (in F): ");
        temp = in.nextDouble();
        System.out.print("Enter the wind velocity (in mph): ");
        velocity = in.nextDouble();

        //Calculating the Wind Chill from the given values of temperature and velocity
        windChill = 35.74 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) * Math.pow(velocity, 0.16));

        System.out.printf("When %n Temperature = %.2f F %n Velocity = %.2f mph %n The Wind chill is %.2f F.", temp, velocity, windChill);

    }
}
