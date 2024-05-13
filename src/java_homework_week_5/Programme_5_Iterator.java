package java_homework_week_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme_5_Iterator {
    public static void main(String[] args) {
        //Create new array list
        ArrayList<Integer> numberList = new ArrayList<>();

        //Add number in arraylist
        numberList.add(1);
        numberList.add(10);
        numberList.add(100);
        numberList.add(1000);
        numberList.add(10000);
        numberList.add(100000);

        //create iterator
        Iterator<Integer> iterator = numberList.iterator();

        //iterator and print each element using the iterator
        System.out.println("ArrayList element using Iterator");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

    }

}
