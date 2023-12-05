package Project1;

public class E6Project {
    public static void main(String[] args) {

        // Write a java Program to check whether a given number is prime or not.

        int num = 17;
        int c = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c++;
            }
            if (c == 2){
                System.out.println("It is a Prime number");
            } else {
                System.out.println("It is not a Prime number");
            }
        }else{
            System.out.println("It is not a Prime number");
        }
    }
}
