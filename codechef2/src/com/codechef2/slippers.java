package com.codechef2;

import java.util.Scanner;

public class slippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int x = sc.nextInt();
            int r = n-l;
            int s=Math.min(l,r);
            int m=s*x;
            System.out.println(m);
        }
    }
}
