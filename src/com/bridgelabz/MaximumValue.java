package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 * @author - Mehul Bhange
 * @since - 26-08-2022
 */
public class MaximumValue<T extends Comparable> {

    private T val1;
    private T val2;
    private T val3;
    private T val4;
    public MaximumValue(T val1, T val2, T val3, T val4){
        this.val1 =val1;
        this.val2 = val2;
        this.val3 =val3;
        this.val4 = val4;
    }

    public T maximux(){
        return MaximumValue.findMaximum(val1, val2, val3, val4);
    }

    /*
    * Generic method to compare any type of data and find maximum
    * */
    public static <T extends Comparable> T findMaximum(T val1, T val2, T val3, T val4){
        T max = val1;
        if (val2.compareTo(max) >= 0)
            max = val2;
        if (val3.compareTo(max) >= 0)
            max = val3;
        if (val4.compareTo(max) >= 0)
            max = val4;

        printMax(max);
        return  max;
    }
    /**
     * Generic method to print the maximum value
     */
    public static <T> void printMax(T val){
        System.out.println("Maximum value is : "+ val);
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");

        MaximumValue<Integer> maxInteger = new MaximumValue<>(13,8,25,15);
        maxInteger.maximux();

        MaximumValue<Float> maxFloat = new MaximumValue<>(2.5f, 4.5f, 10.5f, 1.5f);
        maxFloat.maximux();

        MaximumValue<String> maxString = new MaximumValue<>("Apple", "Grapes", "Banana", "Lemon");
        maxString.maximux();
    }
}
