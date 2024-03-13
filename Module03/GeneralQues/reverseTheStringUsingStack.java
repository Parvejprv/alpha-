package alpha-.Module 03.General Ques;


// We have to reverse the String with the help of the Stack

import java.io.*;
import java.util.*;

public class reverseTheStringUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take a String input, First
        String str = sc.next();
        
        // Take a Stack of Character-type
        Stack<Character> st = new Stack<>();        // Create a stack
        
        // push the each of the String's character into the Stack
        for(int i=0; i< str.length(); i++){
            st.push(str.charAt(i));
        }
        
        // To reverse the String wee have to pop the Stack,while size is greater than 0
        while(st.size()>0){
            System.out.print(st.pop());
        }
    }
}
