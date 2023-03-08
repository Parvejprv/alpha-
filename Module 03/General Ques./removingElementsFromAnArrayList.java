import java.util.ArrayList;
import java.util.function.Predicate;

public class removingElementsFromAnArrayList {
    public static void main(String[] args) {
        
        // creating an ArrayList initially
        ArrayList<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Kotlin");

        System.out.println("Initial List: "+ programmingLanguages);

        // remove the kotlin from the list
        // programmingLanguages.remove("Kotlin");           // we can pass the object directly
        programmingLanguages.remove(6);
        System.out.println("After Remove (\"Kotlin\") : "+programmingLanguages);

        // Remove the first occurance of the given element from the ArrayList
        // (The remove() method returns the false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Ruby");
        System.out.println("After remove(\"Ruby\"): " + programmingLanguages);

        
        // Remove all the elements that exist in the given collection
        ArrayList <String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("JavaScript");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After Remove all(scripting Language) : " + programmingLanguages);


        // Remove the elements that predicate
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s){
                return s.startsWith("C");
            }
        });


        /*
            The above removeIf() call can also be written using lambda expression like this -
            programmingLanguages.removeIf(s -> s.startsWith("C"))
        */

        System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);

    }   
}
