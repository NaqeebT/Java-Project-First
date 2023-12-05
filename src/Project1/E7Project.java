package Project1;

public class E7Project {
    public static void main(String[] args) {

        // Write a java program to print the first 10 numbers of Fibonacci series.

                // Number of terms to be printed
                int n = 10;

                // Print the first 10 numbers of the Fibonacci series
                System.out.println("First " + n + " numbers of Fibonacci series:");

                int firstTerm = 0;
                int secondTerm = 1;

                for (int i = 1; i <= n; ++i) {
                    System.out.print(firstTerm + " ");

                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
            }
        }



