package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.Arrays;

public class Task4_CombineTwoArrays {
    public static void main(String[] args) {
        //T[] newArray = Arrays.copyOf(array, newLength); newLength is new array`s length
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

         /* option 2
        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        System.out.println(combined);

         */

        String [] combineArray = Arrays.copyOf(arr1,arr1.length + arr2.length);

        for (int i= 0, j = arr1.length; i < arr2.length; i++, j++) { // it starts arr1.length to arr2.length-1
            combineArray[j] = arr2[i];
        }

        System.out.println("combineArray = " + Arrays.toString(combineArray));


    }
}

/*
Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */