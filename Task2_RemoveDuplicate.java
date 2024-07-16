package Muhtar_SDET.Day23_ArrayListContinue;

import java.util.ArrayList;

public class Task2_RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Hakan");//1
        names.add("Halime");
        names.add("Huseyin");
        names.add("Yunus");

        ArrayList<String> nonDup = new ArrayList<>(); // creating new arraylist

        for (String each : names) { // for each getting all element from names
            if (nonDup.contains(each)){ // check whether nonDup has element or not
                continue;                // if it has skip
            }

            nonDup.add(each); // add if nonDup does not contains element
        }
        names = nonDup; // first names arraylist is eligible for garbage collection// extra process, no longer needed
        System.out.println(nonDup);


    }
}
