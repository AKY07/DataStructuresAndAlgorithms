package com.dsa;

public class FindWays {
    public static void main(String[] args) {
        System.out.println(noOfWays(4,3));
    }
    static int noOfWays(int n, int m)
    {
        if(n==1 || m==1) return 1;
        return noOfWays(n-1,m) + noOfWays(n,m-1);
    }
}




