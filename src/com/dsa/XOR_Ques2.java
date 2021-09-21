//Ques2-Find the two non-repeating elements in an any array where every element repeats twice.

package com.dsa;

public class XOR_Ques2 {
    public static void findNonRepeating(int arr[], int size_of_arr) {

        int res = 0;
        for (int i = 0; i < size_of_arr; i++) {
            res = res ^ arr[i];
        }
        res = (res & -res);

        int res1 = 0;
        int res2 = 0;

        for (int j = 0; j < size_of_arr; j++) {
            if ((arr[j] & res) > 0) {
                res1 = (res1 ^ arr[j]);
            } else {
                res2 = (res2 ^ arr[j]);
            }
        }
        System.out.println("The Non-Repeating elements are "+res1+" & "+res2);
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,4,9,3,1,7};
        int n=arr.length;
        findNonRepeating(arr,n);
    }
}
