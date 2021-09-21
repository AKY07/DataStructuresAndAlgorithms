//JosephusProblem

package com.dsa;

public class Josephus_Problem {
    public static void main(String[] args) {
        System.out.println("Person at position "+(josephus(7,3)+1)+" survives");
    }
    static int josephus(int n, int k){
        if(n==1) return 0;
        return (josephus(n-1,k)+k)%n;
    }
}
