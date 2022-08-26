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
    /*
     * This method used to compare three float values and get the maximum value
     * It returns maximum float value
     * */
    public static Float findMaxFloat(Float num1, Float num2, Float num3){
        Float max = num1;
        if (num2.compareTo(max) >= 0)
            max = num2;
        if (num3.compareTo(max) >= 0)
            max = num3;

        return  max;
    }
    /*
     * This method used to compare three String values and get the maximum value
     * */
    public static String findMaxString(String val1, String val2, String val3){
        String max = val1;
        if (val2.compareTo(max) >= 0)
            max = val2;
        if (val3.compareTo(max) >= 0)
            max = val3;

        return  max;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        //called findMaxInteger() 
        System.out.println("The maximum value between the three integer is : " + findMaxInteger(13, 8, 15));

        System.out.println("The maximum value between the three float is : " + findMaxFloat(2.5f, 4.5f, 0.5f));

        System.out.println("The maximum value between the three string is : " + findMaxString("Apple", "Peach", "Banana"));
    }
}
