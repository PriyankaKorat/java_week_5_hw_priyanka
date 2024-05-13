package java_homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_CheckArrayList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        //checked arrayList
        checkArrayListIsEmpty(nameList);

        nameList.add("Prime");
        nameList.add("Sheetal");
        nameList.add("Smita");
        nameList.add("Yatri");
        nameList.add("Keyur");
        nameList.add("Priyanka");
        checkArrayListIsEmpty(nameList);
    }

    public static void checkArrayListIsEmpty(ArrayList nameList) {
        if (nameList.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");

            //print collection using for loop
            for (Object studentName : nameList) {
                System.out.print(studentName + ", ");
            }

        }
    }

}
