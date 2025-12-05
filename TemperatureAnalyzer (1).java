//Elijah Stack

import java.util.Scanner;

public class TemperatureAnalyzer 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        // Create an array to store 10 temperatures (decimal values)
        double[] temps = new double[10];

        System.out.println("=== Temperature Analyzer ===");
        System.out.println("Please enter the temperatures for 10 days.\n");

        // ----------------------------
        // INPUT SECTION
        // ----------------------------
        // Loop to fill the array with user-entered temperatures
        for (int i = 0; i < temps.length; i++) 
        {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");

            // Validate input is a decimal number
            if (!input.hasNextDouble()) 
            {
                System.out.println("Error: Temperature must be a valid number.");
                input.close();
                return; // terminate program immediately
            }

            temps[i] = input.nextDouble(); // store temperature in array
        }

        // ----------------------------
        // AVERAGE CALCULATION
        // ----------------------------
        double sum = 0;

        // Add all elements in the array
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        double average = sum / temps.length; // compute average

        System.out.printf("\nAverage temperature: %.2f\n", average);

        // ----------------------------
        // PRINT VALUES BELOW AVERAGE
        // ----------------------------
        System.out.println("\nTemperatures strictly below the average:");

        boolean foundBelow = false; // flag to check if any exist

        for (int i = 0; i < temps.length; i++) 
        {
            if (temps[i] < average) 
            {
                foundBelow = true;
                // Print day number + temperature
                System.out.printf("Day %d: %.2f\n", (i + 1), temps[i]);
            }
        }

        // If no values were below average, print nothing extra
        if (!foundBelow) 
        {
            System.out.println("(None)");
        }

        input.close();
    }
}
