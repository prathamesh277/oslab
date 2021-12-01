package com.codechef2;

import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            if(sum%2==0)
            {
                System.out.println("bob");
            }
            else
            {
                System.out.println("alice");
            }
        }
    }
}
