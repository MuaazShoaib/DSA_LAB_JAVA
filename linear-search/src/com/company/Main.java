package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {2, 4, 0, 1, 9};
        int x = 1;

        int result = LinearSearch.linearsearch(array, x);


        if (result == -1)
            System.out.print("Element not found");
        else
            System.out.print("Element found at index: " + result);
    }
}

