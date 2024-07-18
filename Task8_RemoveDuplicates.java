package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task8_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList<Integer> uniqueElements = new ArrayList<>(); // create a new list and add when elements do not contain inside

        for (Integer each : list) {
            if (!uniqueElements.contains(each)){
                uniqueElements.add(each);
            }
        }
        System.out.println(uniqueElements);

    }

}
/*
 Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */