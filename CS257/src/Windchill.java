/**
 * Class Windchill - HW #2
 * @Author - Roshan Poudel
 */


import java.util.Scanner;

public class  Windchill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double temp; //air temperature in degrees Fahrenheit
        double velocity; //wind speed in miles per hour (mph)
        double windChill; //wind chill in degrees Fahrenheit
        String contd = "yes";

        do {
            System.out.print("Enter temperature (in F): ");
            temp = in.nextDouble();
            System.out.print("Enter the wind velocity (in mph): ");
            velocity = in.nextDouble();

            if (temp < 45 && velocity <= 60) {
                //Calculating the Wind Chill from the given values of temperature and velocity
                windChill = 35.74 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) * Math.pow(velocity, 0.16));
                System.out.printf("When %n Temperature = %.2f F %n Velocity = %.2f mph %n The Wind chill is %.2f F. %n", temp, velocity, windChill);
                System.out.println("\n" + "Continue ? Enter any key to continue, type 'no' to exit.");
                contd = in.next();
            } else {
                String err = temp >= 45 ? "Invalid input for temperature. Please enter a value less than 45 F.\n" :
                        "Invalid input for wind speed. Please enter a value up to 60 mph.\n";
                System.out.println(err);
            }
        } while (!contd.equals("no")); //if contd == "no" the loop terminates
    }
}
