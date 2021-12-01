package com.codechef2;

import java.util.Scanner;

public class tablet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int b=sc.nextInt();
            for(int j=0;j<n;j++) {
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[2]>b)
                {
                    System.out.println("no tablet");
                }

            }
        }
    }
}
