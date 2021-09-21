//3-Modulo Arithmetics

package com.dsa;

public class Modulo_Arithmetics {
    public static void main(String[] args) {
        System.out.println(fastPower(66877655,6,1000000007));
    }
    static long fastPower(long a, long b, long n){
        long res=1;
        while (b>0){
            if((b&1) != 0){
                res=(res % n * a % n ) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;
        }
        return res;
    }
}
