//Elena Voinu
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.println("Enter a word to be reversed: ");

        // read the input and save it to the scanner object
        String input = sc.nextLine();

        // creates a StringBuffer with the passed user input as the initial
        //content of the buffer
        StringBuilder sb = new StringBuilder(input);

        // reverse the existing string in the buffer and return it
        String reversedString = sb.reverse().toString();
        System.out.println("The reversed word is " +  reversedString);

        //Check if the reversed string is identical to the original string or not
        if(input.equals(reversedString)){
            System.out.println("This is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }



    }
    }



