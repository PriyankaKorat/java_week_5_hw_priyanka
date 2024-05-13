package java_homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class programme_6_RetrieveElements {
    public static void main(String[] args) {
        ArrayList<String> shapeList = new ArrayList<>();

        shapeList.add("Circle");
        shapeList.add("Square");
        shapeList.add("Oval");
        shapeList.add("Triangle");
        shapeList.add("Haxagon");
        shapeList.add("Octagon");

        int index = 2;
        retriveElements(index, shapeList);
    }

    public static void retriveElements(int key, ArrayList<String> shape) {
        if (key >= 0 && key < shape.size()) {
            String element = shape.get(key);
            System.out.println("Element of index " + key + ": " + element);

        } else
            System.out.println("Array index out of bounds");
    }
}
