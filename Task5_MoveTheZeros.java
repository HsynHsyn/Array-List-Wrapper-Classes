package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5_MoveTheZeros {
    public static void main(String[] args) {

        Integer [] list = {1,0,2,0,3,0,4,0,7,9,10};

        ArrayList<Integer> list1 = new ArrayList<>(); // creating arraylist
        list1.addAll(Arrays.asList(list));
        // System.out.println((Arrays.asList(0))); other option remove all zeros

        ArrayList<Integer> zeroList = new ArrayList<>(); // create zeroList
        ArrayList<Integer> digitList = new ArrayList<>();// create digitList
        ArrayList<Integer> moveToZero = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) { // pull every 0 and digits
            if (list1.get(i) > 0){
                digitList.add(list1.get(i)); //  using get()
            }
            if(list1.get(i) == 0) {
              zeroList.add(list1.get(i));
            }
        }
        moveToZero.addAll(digitList);
        moveToZero.addAll(zeroList);


        System.out.println(moveToZero);

        /* other option
           int numOfZero = Collections.frequency(list, 0);
        list.removeAll(Arrays.asList(0));

        for(int i = 0; i < numOfZero; i++){
            list.add(0);
        }
         */
    }
}
/*
Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]
 */