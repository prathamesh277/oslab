package com.codechef2;

import java.util.Scanner;

public class gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ans =(n+1)*y;
            if(ans>=x)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
