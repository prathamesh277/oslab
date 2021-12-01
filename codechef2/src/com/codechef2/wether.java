package com.codechef2;

import java.util.Scanner;

public class wether {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int arr[]=new int[7];
            int count0=0,count1=0;
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]==0)
                    count0++;
                else
                    count1++;
            }
            if(count1>count0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
