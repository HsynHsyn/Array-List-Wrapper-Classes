package Muhtar_SDET.Day23_ArrayListContinue;

import java.util.ArrayList;

public class Task1_AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        /*for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }*/
        for (Integer each : list) {
            sum += each;
        }
        double average = sum / (double) list.size(); // casted because finding exact number
        System.out.println("average = " + average);
    }
}
/*
Write a program that can find the average number from an arrayList of integers
 */