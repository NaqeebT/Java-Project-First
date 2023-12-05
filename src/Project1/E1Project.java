package Project1;
import java.util.Scanner;

public class E1Project {
    // Create a program that uses an Array to store a list of temperature for week.
    // Then, use a Loop to find out the highest and lowest temperature for the week.

    public static void main(String[] args) {




                // Initialize an array to store temperatures
                double[] temperatureArray = new double[7];

                // Create a Scanner object to get user input
                Scanner scanner = new Scanner(System.in);

                // Get temperatures for each day of the week
                for (int day = 0; day < 7; day++) {
                    System.out.print("Enter temperature for day " + (day + 1) + ": ");
                    temperatureArray[day] = scanner.nextDouble();
                }

                // Find the highest and lowest temperatures
                double highestTemperature = temperatureArray[0];
                double lowestTemperature = temperatureArray[0];

                for (int i = 1; i < temperatureArray.length; i++) {
                    if (temperatureArray[i] > highestTemperature) {
                        highestTemperature = temperatureArray[i];
                    } else if (temperatureArray[i] < lowestTemperature) {
                        lowestTemperature = temperatureArray[i];
                    }
                }

                // Display the results
                System.out.println("\nHighest Temperature for the week: " + highestTemperature + "°C");
                System.out.println("Lowest Temperature for the week: " + lowestTemperature + "°C");

                // Close the scanner
                scanner.close();
            }
        }








