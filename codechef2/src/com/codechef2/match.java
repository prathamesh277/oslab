package com.codechef2;

import java.util.Scanner;

public class match {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int count1=0,count2=0;
        while(t-->0)
        {
            int arr[]=new int[5];
            for(int i=0;i<5;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++)
            {
                if(arr[i]==1)
                    count1++;
                else if(arr[i]==2)
                    count2++;
            }
            if(count1>count2)
                System.out.println("INDIA");
            else if(count1<count2)
                System.out.println("ENGLAND");
            else
                System.out.println("DRAW");
            count1=0;
            count2=0;
        }
    }
}
