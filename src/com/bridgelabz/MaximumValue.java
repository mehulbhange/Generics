package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 * @author - Mehul Bhange
 * @since - 26-08-2022
 */
public class MaximumValue {
    /*
    * This method used to compare three integer values and get the maximum value
    * It returns maximum integer value
    * */
    public static Integer findMaxInteger(Integer num1, Integer num2, Integer num3){
        Integer max = num1;
        if (num2.compareTo(max) >= 0)
            max = num2;
        if (num3.compareTo(max) >= 0)
            max = num3;

        return  max;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        //called findMaxInteger() 
        System.out.println("The maximum value between the three integer is : " + findMaxInteger(13, 8, 15));
    }
}
