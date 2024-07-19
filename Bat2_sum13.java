package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.CodingBat;

public class Bat2_sum13 {
    public static void main(String[] args) {

        System.out.println(sum13(new int[]{1, 2, 13, 2, 1, 13}));

    }

    public static int sum13(int[] nums) {

        int sum = 0;

        if (nums.length == 0){
            return sum;
        }
        for (int each : nums) {
            sum +=each;

            if (each == 13){
                sum =sum-each;
                break;

            }
        }


        return sum;
    }

    }

    /* Correct solution
    int sum = 0;
        boolean skipNext = false;  

        for (int each : nums) {
            if (each == 13) {
                skipNext = true; 
            } else if (skipNext) {
                skipNext = false; 
            } else {
                sum += each; 
            }
        }

        return sum;
    }

     */

/*
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
 so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */
