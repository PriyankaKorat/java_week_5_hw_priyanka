package java_homework_week_5.programme_1_calculate;

import java.util.Scanner;

/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner scanner = new Scanner(System.in);
        //creating instance class object
        Calculator obj = new Calculator();

        char ans = 'Y';
        while ((ans == 'Y') || (ans == 'y')) {
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter the Second number");
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /:");
            Character symbol = scanner.next().charAt(0);

            obj.calculateResult(num1, num2, symbol);
            System.out.print("Would you like to do more calculation Please enter 'Y' or 'N' :");
            ans = scanner.next().charAt(0);
            //close scanner
            scanner.close();
        }

    }
}
