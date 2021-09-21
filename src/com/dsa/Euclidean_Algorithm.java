//1-GCD by using Euclidean Algorithm.

package com.dsa;

public class Euclidean_Algorithm {
    public static void main(String[] args) {
        System.out.println(gcd(28,12));
    }
    static  int gcd(int x, int y){
        if(y == 0) return x;
        return  gcd(y, x%y);
    }
}
