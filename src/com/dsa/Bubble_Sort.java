package com.dsa;

public class Bubble_Sort {
    void bubblesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n-1; i++)
            for (int j = 0; j<n-i-1; j++ )
                if (arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n; ++i)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }
    public static void main(String args[]){
        Bubble_Sort ob =  new Bubble_Sort();
        int arr[] = {54,32,56,76,23,11};
        ob.bubblesort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }

}
