package alpha-.Module-03.GeneralQues;


import java.util.ArrayList;

/*
Question : create An Array By Another Collection
*/

public class accessingElementsFromAnArrayList {
    public static void main(String[] args) {

        // creating an ArrayList for accessing the elements from an ArrayList
        ArrayList<String> topCompanies = new ArrayList<>();
        System.out.println("Check if Array List is Empty or not ? "+topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are top " + topCompanies.size());
        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company : " + bestCompany);
        System.out.println("Second Best Company : " + secondBestCompany);
        System.out.println("Last Company in the List : " + lastCompany);

        // Now, check if the ArrayList is empty or not
        System.out.println("Afetr Adding the Elements, Check if Array List is Empty or not ? "+topCompanies.isEmpty());

    }
}
