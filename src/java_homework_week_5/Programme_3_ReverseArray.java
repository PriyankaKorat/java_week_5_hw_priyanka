package java_homework_week_5;

import java.util.Arrays;
import java.util.Scanner;

public class Programme_3_ReverseArray {
    //declare reverse int array method
    public static void reverseIntArray(int[] intArr) {
        //local variable
        int startVal = 0;
        int endValue = (intArr.length - 1);
        //reverse array with the use of temp variable
        while (startVal < endValue) {
            int tempVal = intArr[startVal];
            intArr[startVal] = intArr[endValue];
            intArr[endValue] = tempVal;
            startVal++;
            endValue--;
        }
    }

    //declare main method
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of integer array : ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        //numeric array
        int[] numArray = new int[arrLength];
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Please enter " + i + " element value of number array ");
            numArray[i] = scanner.nextInt();

        }
        System.out.println("Original Array: " + Arrays.toString(numArray));

        //method calling
        reverseIntArray(numArray);
        System.out.println("Reverse Array is: " + Arrays.toString(numArray));
        //close scanner
        scanner.close();
    }
}
