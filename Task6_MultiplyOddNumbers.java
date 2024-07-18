package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_MultiplyOddNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));// add elements to the array list

        //Integer[] list1 = {1, 2, 3, 4, 5};
       // list.addAll(Arrays.asList(list1));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) { // get method picks the element
                list.set(i,list.get(i) * 2); // set method changes the element
            }

        }
        System.out.println(list);
    }
}
/*
Create a class called MultiplyOddNumbers and write a program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]
 */