package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("uniqueChars: " + uniqueChars("hello, world!"));

        Set<Integer> ints = new HashSet<>(
                Arrays.asList(
                        -3, 2, 8, -9, 9, -11
                )
        );
        System.out.println("before removeNegative " + ints);
        removeNegative(ints);
        System.out.println("after removeNegative " + ints);
    }
//Task 1
    public static Set<Character> uniqueChars(String s) {
        Set<Character> c = new HashSet<>();
        for(Character ch : s.toCharArray()) {
            c.add(ch);
        }
        return c;
    }

//Task 2
public static void removeNegative(Set<Integer> ints) {
        for(Iterator<Integer> iterator = ints.iterator(); iterator.hasNext();) {
            if(iterator.next() < 0) {
                iterator.remove();
            }
        }
    }


}