package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

import java.util.Arrays;

public class Task3_GradesArray {
    public static void main(String[] args) {

        String[] names = {"Enes", "Hasan", "Nurefsan", "Refianur"};
        int[] scores = {100, 90, 85, 80};

        char[] grades = new char[names.length]; //isimlerin adedince 'uzunlugunca' char  A B C D

        for (int i = 0; i < names.length; i++) {

            int score = scores[i];



            if (score >= 100){
                grades[i] = 'A';
            }else if ( score >= 90){
                grades[i] = 'B';
            }else if (score >= 85){
                grades[i] = 'C';
            } else if (score >= 80){
                grades[i] = 'D';
            }else {
                grades[i] = 'F';
            }


            System.out.println(names[i] + "'s score is " + score + " , and grade is " + grades[i]);

        }
        System.out.println(Arrays.toString(grades));
    }

}

