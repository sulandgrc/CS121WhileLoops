import java.util.Scanner;

/**
 * Name: <your name here>
 *
 * CS 121
 *
 * Core Topics: While Loops, Do While Loops, Fenceposts, Scanner Input Validation, Sentinel Values
 */

public class WhileLoops {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //  System.out.println("Sum is: " + whileSum(console));
        //  System.out.println("Sum is: " + doWhileSum(console));
        //

        int num = readInt(console, "Enter an integer: ");
        System.out.println("You entered integer " + num);

        char character = readCharacter(console, "Enter a character: ");
        System.out.println("You entered character " + character);


        //double decimal = readDecimal(console, "Enter a decimal number: ");
        //System.out.println("You entered decimal " + decimal);
        
        fencepost(10);
        //String list = fencepostReturn(5);
        //System.out.println("My list has " + list);

    }


    /**
     * This method stops prompting for numbers once a negative one
     * is entered
     *
     * @param console object to receive user's keyboard input
     * @return sum of all numbers (except -1) is  entered
     */
    public static int whileSum(Scanner console) {
        int sum = 0, number = 0;

        while (number != -1) {
            sum = sum + number;

            System.out.print("Enter an integer (-1 to quit): ");
            number = console.nextInt();
        }

        return sum;
    }

    /**
     * TODO: This method stops prompting for numbers once a negative number
     * is entered
     *
     * @param console object to receive user's keyboard input
     * @return sum of all numbers (except -1) entered
     */
    public static int doWhileSum(Scanner console) {
        int sum = 0, number = 0;

        return sum;
    }





    /**
     * This method continually prompts the user until they enter an
     * integer value
     *
     * @param console Scanner object to read from keyboard
     * @param prompt  text to prompt user for integer input
     * @return the integer value the user entered
     */
    public static int readInt(Scanner console, String prompt) {

        System.out.print(prompt);

        // in the following while loop the user is forced to enter an integer
        // while the user has NOT entered an integer
        while (!console.hasNextInt()) {
            // clear the user's entry that does not contain an integer
            console.nextLine();
            // prompt user again
            System.out.print(prompt);
        }
        // outside while loop: if here the user has entered an integer
        int num = console.nextInt();

        // clear out the newline character left in the Scanner's buffer in case
        // user wants to use the .nextLine() method next
        console.nextLine();

        return num;


    }

    /**
     * This method continually prompts the user until they enter one
     * character
     *
     * @param console Scanner object to read from keyboard
     * @param prompt  text to prompt user for char input
     * @return character value user entered
     */
    public static char readCharacter(Scanner console, String prompt) {
        String text = "";

        // the following do-while loop forces the user to enter one character
        do {
            System.out.print(prompt);
            text = console.nextLine();
        } while (text.length() != 1);

        return text.charAt(0);

    }

    /**
     * TODO: This method continually prompts the user until they enter one
     * decimal number
     *
     * @param console Scanner object to read from keyboard
     * @param prompt  text to prompt user for decimal input
     * @return decimal value user entered
     */
    public static double readDecimal(Scanner console, String prompt) {

        return 0.0;
    }

    /**
     * This method will print a list of numbers 1 to n separated by a comma
     * This method throws an IllegalArgumentException if n < 1
     * Example Output for fencepost(10): 1,2,3,4,5,6,7,8,9,10
     *
     * @param n the highest number to print
     */
    public static void fencepost(int n) {
        // if n is < 1 throw an IllegalArgumentException and leave the method
        if (n < 1) {
            throw new IllegalArgumentException(n + " is less than 1.");
        }
        
        // print number with a comma
        for (int i = 1; i < n; i++ ) {
           System.out.print(i + ",");
        }
        
        // print the last number without a comma and a newline
        System.out.println(n);

    }
    
    /**
     * TODO: This method will return a list of numbers 1 to n separated by a comma as
     * a string. This method throws an IllegalArgumentException if n < 1
     * Example Return for fencepostReturn(10): 1,2,3,4,5,6,7,8,9,10
     *
     * @param n the highest number to print
     * @return a list of numbers 1 to n separated by a comma
     */
    public static String fencepostReturn(int n) {
    
        if (n < 1) {
           throw new IllegalArgumentException(n + " is less than 1.");
        }
        
        
        //TODO: rewrite the fencepost method above to use a do-while loop
        // and return the numbers as a string 
       
        return "";
    }

}

