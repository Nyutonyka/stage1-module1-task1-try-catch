package com.epam.m1.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String next = null;
        int number = 0;
        List<String> justWords = new ArrayList<>();
        while (words.hasNext()) {
           next = words.next();
            try {
                number = Integer.parseInt(next);
                sum += number;
                next = null;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            if (next != null){
                justWords.add(next);
            }
        }
        System.out.println("Sum is " + sum);
        System.out.print("Just words: ");
        for (String s: justWords) {
            System.out.print(s + " ");
        }
    }
}

