package java_homework_week_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColorArrayList {
    //declare color array method
    public static void colorArrayList(int length) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> colorList = new ArrayList();
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the color");
            String colorName = sc.nextLine();
            colorList.add(colorName);

        }

        for (String color : colorList) {
            System.out.println(color);
        }

    }

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of integer array : ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        colorArrayList(arrLength);
    }
}
