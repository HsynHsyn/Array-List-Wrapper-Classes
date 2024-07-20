package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

public class OzTask2_FirstElementOne {
    public static void main(String[] args) {
        int[] x = {7,2,3};
        int[] y = {1};

        System.out.println(countOne(x,y));

    }

    public static int countOne(int[] array1, int[] array2){

        int count = 0;
        int count1 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (i==0 && array1[i] == 1){
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (i==0 && array2[0] == 1){
                count1++;
            }
        }



        return count+count1;
    }
}


/*
Write a method that accepts two arrays and prints how many of the arrays have 1 as their first
element

int[] x = {1,2,3}
Int[] y = {1,3}
Output = 2

int[] x = {7,2,3}
Int[] y = {1}
Output = 1

int[] x = {3,2,4}
Int[] y = {4,3,4}
Output = 0
 */