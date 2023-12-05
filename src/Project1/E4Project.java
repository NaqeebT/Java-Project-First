package Project1;

public class E4Project {
    public static void main(String[] args) {

        // Create a 2D Array of int, develop a program which calculate the sum of
        // even and odd numbers of that array.

                // Create a 2D array of int
                int[][] numbers = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };


                int sumEven = 0;
                int sumOdd = 0;

                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers[i].length; j++) {
                        if (numbers[i][j] % 2 == 0) {
                            sumEven += numbers[i][j];
                        } else {
                            sumOdd += numbers[i][j];
                        }
                    }
                }

                // Display the results
                System.out.println("Sum of even numbers: " + sumEven);
                System.out.println("Sum of odd numbers: " + sumOdd);
            }
        }



