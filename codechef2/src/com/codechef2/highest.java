package com.codechef2;

import java.util.Arrays;
import java.util.Scanner;

public class highest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[11];
        for(int i=1;i<=10;i++)
        {
            if(n%i==0)
                arr[i]=i;
        }
        Arrays.sort(arr);
        System.out.println(arr[10]);
    }
}
