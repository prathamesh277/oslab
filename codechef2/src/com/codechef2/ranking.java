package com.codechef2;

import java.util.Scanner;

public class ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int arr[]= new int[6];
            for(int i=0;i<6;i++)
            {
                arr[i]=sc.nextInt();
            }
            int sum1=0;
            int sum2=0;
            for(int i=0;i<3;i++)
            {
                sum1=sum1+arr[i];
            }
            for(int i=3;i<6;i++)
            {
                sum2=sum2+arr[i];
            }
            if(sum1>sum2)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("2");
            }
        }
    }
}
