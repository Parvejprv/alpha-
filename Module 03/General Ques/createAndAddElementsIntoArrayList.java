package alpha-.Module 03.General Ques;


import java.util.ArrayList;

/*
*******************************************************************************************************************************************************************************************************************************************************************
@Author : Parvej Alam
Profession : Software Developer Engineer


Question : 1. Creating an ArrayList and adding the new Element to it.

************************ ********************************************************************************************************************************************************************************************************************************************
*/

public class createAndAddElementsIntoArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String>  animals = new ArrayList<>();

        System.out.println("check if the arrayList is empty or Not ? "+animals.isEmpty());
        // System.out.println(animals);

        // Adding the new element to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Cat");
        animals.add("Deer");

        System.out.println("Output");
        System.out.println(animals);
        System.out.println("check if the arrayList is empty or Not, Now ? "+animals.isEmpty());

        animals.add("Hippo");
        System.out.println(animals);
    }
}



/*
                        * Details about the Question *

1. Creating an ArrayList and adding the new Element to it.

Note : 


*/ 
