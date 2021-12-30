package com.company;

public class LinearSearch {

    public static int linearsearch(int array[], int x){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == x){
                return i;
            }
        }

        return -1;
    }
}
