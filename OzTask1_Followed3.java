package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

import java.util.Arrays;

public class OzTask1_Followed3 {
    public static void main(String[] args) {
        int[] x = {2,3,5};
        method3(x);
    }

    public static void method3(int[] nums){

        int[] newNums = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] != 3){
                newNums [i] = nums[i];
            }else {
                newNums[i] = 0;

            }

        }
        System.out.println(Arrays.toString(newNums));
    }

}
/*
Write a method that accepts an array, and if there is a 2 in the array immediately
followed by a 3, set the 3 element to 0. Print the changed Array

int[] x = {1,2,3} = > [1,2,0]
int[] x = {2,3,5} = > [2,0,5]
int[] x = {1,2,1} = > [1,2,1]
int[] x = {11,2,13,3,2} = > [11,2,13,3,2]
*/