package com.codechef2;

import java.util.Scanner;

public class drunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int n= sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    count=count-1;
                }
                else
                {
                    count=count+3;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
