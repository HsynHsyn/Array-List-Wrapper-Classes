package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3_DuplicateElements  {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer [] list = {1,2,3,4,5};
        arrayList.addAll(Arrays.asList(list)); // added list to arrayList with allAdd();

        ArrayList<Integer> uniqueElements = new ArrayList<>(); // creating new array and add new elements

        for (Integer each : arrayList) {
            if (Collections.frequency(arrayList,each)==1){ // if element is 1 in the arrayList then add element to uniqueElements
                uniqueElements.add(each);
            }

        }
        arrayList.addAll(uniqueElements); // adding uniqueElements arraylist to our arrayList
        System.out.println(arrayList);

    }
}
/*
Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */