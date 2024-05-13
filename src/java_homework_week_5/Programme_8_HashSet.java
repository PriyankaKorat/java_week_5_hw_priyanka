package java_homework_week_5;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {
        //create Hashset
        HashSet<Integer> number = new HashSet<>();

        //Store value in HashSet
        number.add(4);
        number.add(7);
        number.add(8);

        //called method
        checkHashSet(number);

    }

    public static void checkHashSet(HashSet<Integer> numbers) {
        //Check number between 1 to 10
        System.out.println("Number between 1 and 10 that are in the set");
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i))
                System.out.println(i + " is in the set");
            else
                System.out.println(i + " is not in the set");
        }

    }

}
