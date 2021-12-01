package com.codechef2;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int arr[]= new int[3];
            for (int i=0;i<3;i++)
            {
                arr[i]= sc.nextInt();
                if(arr[i]==7)
                {
                   count++;
                }
            }
            if(count>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            count=0;
        }
    }
}
