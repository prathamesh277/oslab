package com.codechef2;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int s=0;
        while(t-->0)
        {
            int count=0;
            int n=sc.nextInt();
            while(n>0)
            {
                 s= (int) Math.sqrt(n);
                 n=n-(s*s);
                 count++;
            }
            System.out.println(count);
        }
    }
}
