package com.codechef2;

import java.util.Scanner;

public class island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int d=sc.nextInt();
            if(x1*d<=x && y1*d<=y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
