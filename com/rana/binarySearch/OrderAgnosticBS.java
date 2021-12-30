package com.rana.binarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] a = new int[n];

        for(int i = 0;i < a.length;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter the target");
        int target = in.nextInt();

        int output = orderAgnosticBS(a,target);
        if(output == -1){
            System.out.println("Target not found in the array");
        }
        else{
            System.out.println("Index of the target is: "+output);
        }
    }

    //return the index or return -1 if it does not exists
    static int orderAgnosticBS(int[] a, int target){
        int start = 0;
        int end = a.length - 1;

        if(a[start] < a[end]){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(a[mid] == target){
                    return mid;
                }
                else if(a[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        else{
            while(start <= end){
                int mid = start + (end-start)/2;
                if(a[mid] == target){
                    return mid;
                }
                else if(a[mid] > target){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
