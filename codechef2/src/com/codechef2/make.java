package com.codechef2;

import java.util.Arrays;
import java.util.Scanner;

public class make {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int count1=0,count2=0;
        int max=0;
        while(t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min=arr[0];
            max=arr[n-1];
            System.out.println(max-min);
        }
    }
}
