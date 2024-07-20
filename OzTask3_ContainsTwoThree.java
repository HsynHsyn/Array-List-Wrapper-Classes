package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OzTask3_ContainsTwoThree {
    public static void main(String[] args) {

        System.out.println(twoThree(new int[]{12,20,42}));

    }

    public static boolean twoThree(int[] array){

        //Array to ArrayList
        Integer[] arr = new Integer[]{12,20,42}; // string is not a primitive, so we can convert it to a list

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.frequency(list,2);

        int count = 0;
        int count1 = 0;

        for (int each : array) {
            if (each == 2){
                count ++;
            }else if (each == 3){
                count1 ++;
            }

        }
        boolean result = false;
        if (count == 2){
           result = true;
        }
        if (count1 == 2){
            result = true;
        }

        return result;
    }
}
/*

Write a method that accepts an array and prints true if the array contains 2 twice or 3
twice.

int[] x = {2,2}; = > true

int[] y = {3,3}; = > true

int[] a = {2,3}; = > false

int[] b = {12,20,42}; = > false

int[] c = {2,2,2}; = > false
 */