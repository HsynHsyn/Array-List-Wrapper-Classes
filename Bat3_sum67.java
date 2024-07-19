package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.CodingBat;

import java.util.Arrays;

import static Utilities.ArraysUtility.contains;

public class Bat3_sum67 {

    public static void main(String[] args) {

        System.out.println(sum67(new int[]{1, 2, 2}));


    }

    private static int sum67(int[] nums) {

        int sum = 0;
        boolean inRange = false; // Başlangıçta 6-7 aralığında değiliz, bu yüzden false

        for (int num : nums) {
            if (num == 6) {
                inRange = true; // 6'yı gördüğümüzde, 6-7 aralığına gireriz
            }
            if (!inRange) {
                sum += num; // Eğer 6-7 aralığında değilsek, sayıyı toplama ekleriz
            }
            if (num == 7 && inRange) {
                inRange = false; // 7'yi gördüğümüzde ve 6-7 aralığındaysak, aralığı sonlandırırız
            }

        }

        return sum; // Toplamı döndürür
    }


}
/*
Return the sum of the numbers in the array,
except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
 Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */