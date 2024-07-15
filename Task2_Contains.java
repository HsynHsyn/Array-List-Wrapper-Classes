package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

import Muhtar_SDET.Day20_ArraysContinue_ForEach.ArrayUtilityMethods;
import Utilities.ArraysUtility;

public class Task2_Contains {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        boolean has25 = ArraysUtility.contains(numbers,25);
        System.out.println(has25); // false

        System.out.println("-------------------------------------------");

        String[] students =  {"Hakan","Halime","Huseyin","Beklenen"} ;

        boolean hasHalime = ArraysUtility.contains(students,"Halime");
        System.out.println(hasHalime);
    }
}
