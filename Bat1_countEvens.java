package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.CodingBat;

public class Bat1_countEvens {

    public static void main(String[] args) {

        System.out.println(countEvens());

    }

    public static int countEvens() {
            int[] arr1 = {2, 1, 2, 3, 4};
            int[] arr2 = {2, 2, 0};
            int[] arr3 = {1, 3, 5};

            int count = 0;
            for (int each : arr3) {
                if (each % 2 == 0) {
                    count++;
                }
            }
       return count;
        }
    }




/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */