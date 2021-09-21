package com.dsa;

public class MajorityElement {
    void printMajorityElement(int a[], int size)
    {
        int candidate = findCandidate(a, size);
        if(isCandidateMajority(a, size, candidate))
            System.out.println("Majority Element is "+candidate);
        else
            System.out.println("No Majority Element");
    }
    int findCandidate(int a[], int size)
    {
        int ansIndex = 0;
        int count = 0;
        for(int i = 1; i < size; i++){
            if(a[i] == a[ansIndex])
                count++;
            else
                count--;
            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        return a[ansIndex];
    }
    boolean isCandidateMajority(int a[], int size, int candidate)
    {
       int count = 0;
        for(int i = 0; i < size; i++){
            if(a[i] == candidate)
                count++;
        }
        if(count > size/2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int a[] = new int[]{2,1,2,2,3};
        int size = a.length;
        majorityElement.printMajorityElement(a, size);
    }
}
