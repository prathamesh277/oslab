package com.codechef2;

import java.util.Scanner;

public class LAZY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            int l=x*m;
            int k=x+d;
            System.out.println(Math.min(l,k));
        }
    }
}
