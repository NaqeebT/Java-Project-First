package Project1;

public class E8Project {

    public static void main(String[] args) {


        // Maximum and minimum numbers in the given Array.

                // Given array
                int[] numbers = {5, 12, 3, 8, 1, 9, 7, 15, 4, 10};

                // Find maximum and minimum numbers in the array
                int max = numbers[0];
                int min = numbers[0];

                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }

                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }

                // Display the results
                System.out.println("Maximum number in the array: " + max);
                System.out.println("Minimum number in the array: " + min);
            }
        }



