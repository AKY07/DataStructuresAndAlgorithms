//2-Prime no. using Sieve of Eratosthenes Algorithm.

package com.dsa;

import java.util.Arrays;

public class Sieve_of_Eratosthenes_Algo {
    public static void main(String[] args) {
        boolean isPrime[] = sieveOfEratosthenes(15);
        for(int i = 0; i<=15; i++) {
            System.out.println(i + " is Prime = " + isPrime[i]);
        }
    }
    static boolean[] sieveOfEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i*i <= n; i++){
            for(int j = 2*i; j<=n; j += i){
                isPrime[j] = false;
            }
        }
      return  isPrime;
    }
}
