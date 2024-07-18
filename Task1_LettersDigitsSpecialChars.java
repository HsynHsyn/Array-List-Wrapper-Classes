package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.Arrays;

public class Task1_LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        char[] newChar = str.toCharArray(); // creating char array, we cannot use Collections in there, must be list  // [W, o, o, d, e, n,  , S, p, o, o, n, 1, 2, 3, !]

        // initialize
        String letters = "";
        int digits = 0;
        String specialChars = "";

        for (char each : newChar) {
            if (Character.isLetter(each)){ // checking whether is letter
                letters += each;
            }else if (Character.isDigit(each)){ // checking whether is digit
                digits += each;
            }else {
                specialChars += each; // rest of them are special characters
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}

/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */