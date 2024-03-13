package alpha-.Module 03.General Ques;


import java.util.ArrayList;

public class createAnArrayByAnotherCollection {
    public static void main(String[] args) {
        // Creating an ArrayList from another collection
        ArrayList<Integer> firstFivePrimeNumbers = new ArrayList<>();
        System.out.println("\ncheck if the arrayList is empty or Not ? "+firstFivePrimeNumbers.isEmpty()+"\n");        // check if it is empty or not

        // Add elements to the array list
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        System.out.println("First Five Prime Numbers are : "+firstFivePrimeNumbers);
        System.out.println("Now size of the First Five ArrayList : "+firstFivePrimeNumbers.size());             // size => 5
        System.out.println("check if the arrayList is empty or Not ? "+firstFivePrimeNumbers.isEmpty()+"\n");        // check if it is empty or not  => false


        ArrayList<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);


        ArrayList<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        System.out.println("Next Five Prime Numbers are : "+nextFivePrimeNumbers);
        System.out.println("Now size of the Next Five ArrayList : "+nextFivePrimeNumbers.size());               // size => 5
        System.out.println("check if the arrayList is empty or Not ? "+nextFivePrimeNumbers.isEmpty()+"\n");                 // isEmpty() => false      // check if it is empty or not

        
        // Now, Adding the entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
