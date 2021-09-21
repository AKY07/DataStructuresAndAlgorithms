//Ques1-Find the only non-repeating elements in an any array where every element repeats twice.

package com.dsa;

public class XOR_Ques1 {
    static int findNonRepeating(int arr[], int size_of_arr)
    {
        int res=0;
        for(int i=0;i<size_of_arr;i++)
        {
            res=res^arr[i];

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,9,8,3,9,5,8};
        int n=arr.length;
        int a=findNonRepeating(arr,n);
        System.out.println("Non-Repeating element is "+ a );


    }

}
