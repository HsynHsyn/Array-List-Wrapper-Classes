package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.Arrays;

public class Task2_2_UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA &java".replace(" ","");

        char[] newChar = str.toCharArray();

        int countUpper = 0;
        int countLower = 0;

        for (char each : newChar) {
            if (Character.isLetter(each)) { // check whether each is letter or not
                if (("" + each).equals(("" + each).toUpperCase())) { // to convert string ("" + each)
                    countUpper++;
                } else {
                    countLower++;
                }

            }
        }

        boolean result =  (countLower == countUpper) ? true: false;
        System.out.println(result);

    }
}
