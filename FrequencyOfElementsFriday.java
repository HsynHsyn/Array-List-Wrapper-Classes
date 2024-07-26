package Java_Labs.TheWeek10;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfElementsFriday {
    public static void main(String[] args) {


        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        ArrayList<String> codingLanguages = new ArrayList<>();

        codingLanguages.addAll(Arrays.asList(array));

        //System.out.println(codingLanguages); // [Java, Python, Python, Ruby, Ruby, C#]

        ArrayList<String> resultList = frequencyOfElements(codingLanguages);

        for (String eachElement : resultList) {
            System.out.println(eachElement);
        }

        System.out.println("Frequency Elements of CodingLanguages = " + frequencyOfElements(codingLanguages)); // bu ciktiyida alabiliriz for dongusu yerine
        System.out.println("Unique Elements Of CodingLanguages = " + uniqueElements(codingLanguages));

        System.out.println("--------------------------------------------------");

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry"));
        resultList = frequencyOfElements(fruits);

        System.out.println("Frequency Elements Of Fruits = " + resultList); // Since arraylist is an Object Type data structure, we can directly use println(resultList) option
        System.out.println("Unique Elements Of Fruits = " + uniqueElements(fruits));

        System.out.println("--------------------------------------------------");

    }

    public static ArrayList<String> frequencyOfElements(ArrayList<String> inputList) { // returns as a arraylist
        ArrayList<String> resultList = new ArrayList<>();
        // why we need two loops: first one is to select the element that I will compare to others,
        // second one is to select each of element to compare with the selected one
        // int count = 0; Not Outside
        for (String eachInput : inputList) {

            int count = 0;// we put this inside first loop to reset our counter to zero again
            for (int i = 0; i < inputList.size(); i++) {
                if (eachInput.equals(inputList.get(i))) {
                    count++;
                }
            }
            // Why did I put following lines outside of my second loop?
            String element = eachInput + " = " + count; // printing every element`s count
            // Why do I need to check if that element is already inside my result arraylist?

            if (!resultList.contains(element)) { //  pay attention for resultList.contains(element)
                resultList.add(element);
            }
        }
        return resultList;
    }


    public static ArrayList<String> uniqueElements(ArrayList<String> inputList) {
        ArrayList<String> resultList = new ArrayList<>();
        // first we turn our input list into a modified list that contains frequency of my each element
        ArrayList<String> frequencyOfElementsList = frequencyOfElements(inputList);
        //System.out.println(frequencyOfElementsList);
        //System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (String each : frequencyOfElementsList) {

            if(each.contains("= 1")){ //  frequencyOfElementsList deki 1 tane olan elemanlari almis oluyor
                 resultList.add(each.substring(0,each.length()-4));
                // resultList.add(each.substring(0,each.indexOf("= 1"))); // other way
                }
            }

            return resultList;
        }
    }

