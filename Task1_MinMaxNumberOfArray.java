package Muhtar_SDET.Day22_WrapperClasses_ArrayListIntro;

import java.util.Arrays;

public class Task1_MinMaxNumberOfArray {
    public static void main(String[] args) {

        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

      /*int min = array[0][0]; // initialize with any element which belongs to array
        int max = array[2][0]; // initialize with any element which belongs to array

        for (int[] each1DArray : array) { // to get 1D array because no need any index number
            System.out.println("each1DArray = " + Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) { // to get elements from 1D array because no need any index number
                if (eachElement > max ){  // to find max
                    max = eachElement;
                }
                if (eachElement < min ){ // to find min
                    min = eachElement;
                }

            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);*/


    }

}
/*
 Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */