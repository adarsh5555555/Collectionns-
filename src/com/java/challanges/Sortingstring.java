package com.java.challanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortingstring {
    public static void main(String[] args) {
        System.out.println(countingFrequency());

    }
   public static int  countingFrequency(){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
       myList.add(3);
        myList.add(4);
        myList.add(5);
       return Collections.frequency(myList,5);

   }



}
