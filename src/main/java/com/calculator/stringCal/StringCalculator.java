package com.calculator.stringCal;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String delimiter = ",|\n"; // Default delimiters: comma and newline
            if (numbers.startsWith("//")) {
                // Custom delimiter section
                int delimiterIndex = numbers.indexOf("\n");
                delimiter = numbers.substring(2, delimiterIndex); // Extract the custom delimiter
                numbers = numbers.substring(delimiterIndex + 1); // Remove the custom delimiter line from the numbers string
            }
            String[] numbersArray=numbers.split(delimiter);
            List<Integer> negativeNumbers = new ArrayList<>();

            for(String number:numbersArray){
                int num = Integer.parseInt(number);
                if (num < 0) {
                    negativeNumbers.add(num); // Collect all negative numbers
                }
               sum+=num;
          }
            if (!negativeNumbers.isEmpty()) {
                // Throw an exception if there are negative numbers
                throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
            }
        }
        return sum;
    }
}
