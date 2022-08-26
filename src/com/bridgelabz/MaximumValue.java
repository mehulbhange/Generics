package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 * @author - Mehul Bhange
 * @since - 26-08-2022
 */
public class MaximumValue {

    /*
    * Generic method to compare any type of data and find maximum
    * */
    public static <T extends Comparable<T>> T findMaximum(T val1, T val2, T val3){
        T max = val1;
        if (val2.compareTo(max) >= 0)
            max = val2;
        if (val3.compareTo(max) >= 0)
            max = val3;

        return  max;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");

        System.out.println("The maximum value between the three integer is : " + findMaximum(13, 8, 15));

        System.out.println("The maximum value between the three float is : " + findMaximum(2.5f, 4.5f, 0.5f));

        System.out.println("The maximum value between the three string is : " + findMaximum("Apple", "Peach", "Banana"));
    }
}
