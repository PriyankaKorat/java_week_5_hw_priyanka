package java_homework_week_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("Prime", 12);
        student.put("Testing", 22);
        student.put("Priyanka", 32);
        student.put("Korat", 42);
        checkHashMap(student);

    }

    public static void checkHashMap(Map<String, Integer> student) {
        //for loop is used to iterate value in map
        System.out.println("Name of the student in the map");

        for (Map.Entry<String, Integer> studentName : student.entrySet()) {
            System.out.println(studentName.getKey() + " " + studentName.getValue());

        }
    }

}
