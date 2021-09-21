//Ques3-Find the only non-repeating elements in an any array where every element repeats thrice.

package com.dsa;

public class XOR_Ques3 {
    static int findNonRepeating(int arr[],int n){
        int count[] = new int[32];

        for (int i = 0; i < 32; i++){
            for (int j = 0; j < n; j++){
                if ((arr[j] & (1 << i)) != 0){
                    count[i] += 1;
                }
            }
        }
        int res = 0;
        for(int k = 0; k<32; k++){
            res += (count[k] % 3) * (1 << k);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,7,1,2};
        int n = arr.length;
        System.out.println("Non-Repeating Element is "+findNonRepeating(arr,n));
    }
}
