package com.calculator.stringCal;

public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
          String[] numbersArray=numbers.split(",|\n");
          for(String number:numbersArray){
              System.out.println(Integer.parseInt(number));
              sum+=Integer.parseInt(number);
          }
        }
        return sum;
    }
}
