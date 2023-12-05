package Project1;

public class E2Project {
    public static void main(String[] args) {
        // Create an Array of int values. After the Array is created,
        // calculate the sum of all stored elements in that Array.

                int[] numbers = {5, 10, 15, 20, 25};

                int sum = 0;

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }

                // Display the result
                System.out.println("The sum of all elements in the array is: " + sum);
            }
        }



