package com.rana.binarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] a = new int[n];

        for(int i = 0;i < a.length;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter the target");
        int target = in.nextInt();

        int output = binarySearch(a,target);
        if(output == -1){
            System.out.println("Target not found in the array");
        }
        else{
            System.out.println("Index of the target is: "+output);
        }
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
