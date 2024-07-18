package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2_UpperCaseAndLowerCase {
    public static void main(String[] args) {


        String str = "JAVA java";
        char[] newChar = str.toCharArray();
                //newString = str.split("");
        int countUpper = 0;
        int countLower = 0;

        for (char each : newChar) {
            if (Character.isUpperCase(each)){
                countUpper++;
            }else if (Character.isLowerCase(each)){
                countLower++;
            }

        }
        boolean result =  (countLower == countUpper) ? true: false;
        System.out.println(result);

    }
}
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Examples:
	            str = "JAVA java";

	        output:
	            true
 */