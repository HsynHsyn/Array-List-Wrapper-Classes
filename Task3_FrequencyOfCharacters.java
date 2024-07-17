package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;

import java.util.Arrays;
import java.util.Collections;

public class Task3_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbbccccccdddd"; //a3b5c6d4

        String result = "";

        for (String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);


            if (!result.contains(each)){
                result += each + frequency;
            }
        }
        System.out.println(Arrays.asList(str.split(""))); // convert to list // str.split("") non-primitive
        System.out.println("result = " + result);


    }
}
