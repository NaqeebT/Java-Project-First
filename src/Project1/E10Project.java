package Project1;

public class E10Project {
    public static void main(String[] args) {

        // Write a program to print out duplicate elements from an Array of Strings.

               // Given array of strings
                String[] stringsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange"};

        for(int i=0;i<stringsArray.length;i++) {
            for (int j = i + 1; j < stringsArray.length; j++) {
                if (stringsArray[i].equals(stringsArray[j])) {
                    System.out.print(stringsArray[j] + " ");
                }
            }

        }}}




