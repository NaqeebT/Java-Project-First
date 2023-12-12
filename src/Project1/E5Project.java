package Project1;

public class E5Project {
    public static void main(String[] args) {

        // Write a program to swap two numbers without a temporary variable.

                // Initial values assigned
                int a = 5;
                int b = 10;

                System.out.println("Before swapping: a = " + a + ", b = " + b);

                // Swap without a temporary variable
                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("After swapping: a = " + a + ", b = " + b);
            }
        }



