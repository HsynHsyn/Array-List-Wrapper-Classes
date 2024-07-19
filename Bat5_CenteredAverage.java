package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.CodingBat;

public class Bat5_CenteredAverage {
    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 1, 100}));
    }

    public static int centeredAverage(int[] nums) {

        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        int validCount = 0;
        boolean minRemoved = false;
        boolean maxRemoved = false;


        for (int num : nums) {
            if (num > max){
                max =num;

            }

            if (num < min){
                min =num;

            }
        }

       
        for (int num : nums) {
            if (num == min && !minRemoved) {
            
                minRemoved = true;
            } else if (num == max && !maxRemoved) {
              
                maxRemoved = true;
            } else {
                
                sum += num;
                validCount++;
            }
        }

       
        int average = (validCount == 0) ? 0 : (sum / validCount);
        return average;
    }
}



/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
