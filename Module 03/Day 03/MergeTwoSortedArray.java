/*******************************************************************************************************************
 @Author : Parvej Alam
 Profession : Software Engineer
 Date & Time : 08-03-2023 11:49:00 PM
*******************************************************************************************************************/


// package alpha-.Module 03.Day 03;

import java.util.*;
import java.util.ArrayList;

public class MergeTwoSortedArray {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array1
    	int n = sc.nextInt();			// take size1 input for array1
    	int[] arr1 = new int[n];			// array1 creation
    	for(int i = 0; i < n; i++){
    	    arr1[i] = sc.nextInt();		// array1 elements inputed here
    	}

        // Array2
    	int m = sc.nextInt();			// take size2 input for array2
    	int arr2[] = new int[m];			// array2 creation
    	for(int i = 0; i < m; i++){
    	   arr2[i] = sc.nextInt();			// array2 elements inputed
    	}
        
        
        // create an arrayList to mergearr1oth the arrays
        ArrayList <Integer> arrayList = new ArrayList<>();
        
        // We, have created the arrayList, in which we have to store the elements in the sorted order, and also doesn't have duplicates element, so
        
        int i=0; 
        int j=0;
        
        while(i<n && j<m){
           int minVal = 0;
            // A[i] wouldarr1e minimum, and added to arrayList
            if(arr1[i] < arr1[j]){
                minVal = arr1[i];
                i++;
            }else{
                //arr1[i] wouldarr1e minimum, and added to arrayList
                minVal =arr1[j];
                j++;
            }
            // check for arrayList size, isEmpty or not.
            if(arrayList.size() == 0){
                // arrayList is Empty
                arrayList.add(minVal);			// add those minVal that we have found
            }else{
                // arrayList is not Empty
                if(arrayList.get(arrayList.size()-1) != minVal){			
                    arrayList.add(minVal);
                }
            }
        }
            
        //     /*We can write the above condition, as well as */
        //     if( (arrayList.size() == 0) || (arrayList.size() != 0 && arrayList.get(arrayList.size() - 1 ) != minVal))
        // }
            
            // Check if arrayList size is not equals to 1st Array Element
            while(i<n){
                // arrayList is not Empty
                if(arrayList.get(arrayList.size()-1) != arr1[i]){
                    arrayList.add(arr1[i]);
                }
                i++;
            }
            // Same Check for Array2, if arrayList size is not equals to 2nd Array Element
            while(j<m){
                // arrayList is not Empty
                if(arrayList.get(arrayList.size()-1) !=arr1[j]){
                    arrayList.add(arr2[j]);
                }
                j++;
            }
            
            

        // fetching the elements from the arrayList, using for loop
        for(int ele : arrayList){
        	System.out.print(ele + " ");
    	}
        

    }
}

