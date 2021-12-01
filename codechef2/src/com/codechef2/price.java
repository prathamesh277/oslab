package com.codechef2;

import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        int sum=0;
        int nsum=0;
        while(t-->0)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]>k)
                    arr[i]=k;
                nsum=nsum+arr[i];
            }
            System.out.println(sum-nsum);
            sum=0;
            nsum=0;
        }
    }
}
