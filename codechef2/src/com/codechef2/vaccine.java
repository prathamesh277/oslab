package com.codechef2;

import java.util.Scanner;

public class vaccine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int z=0;
            int o=0;
            int n =sc.nextInt();
            int arr[]=new int[n];
            int p =sc.nextInt();
            int x =sc.nextInt();
            int y =sc.nextInt();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<p;i++)
            {
                if(arr[i]==0)
                {
                    z++;
                }
                else
                {
                    o++;
                }
            }
            System.out.println((z*x)+(o*y));
            z=0;
            o=0;
        }
    }
}
