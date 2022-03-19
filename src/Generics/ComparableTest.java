package Generics;

import java.util.TreeSet;

public class ComparableTest {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(333);
        nums.add(923);
        nums.add(45);
        nums.add(14);
        nums.add(5);

        for(Integer n: nums) {
            System.out.println(n);
        }
        System.out.println("\n");
        for(Integer n: nums.descendingSet()) {
            System.out.println(n);
        }

    }
}
