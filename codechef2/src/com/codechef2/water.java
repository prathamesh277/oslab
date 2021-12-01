package com.codechef2;

import java.util.Scanner;

public class water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int h=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=sc.nextInt();
            int w=x+(y/2);
            int tw=w*h;
            if(tw<=c)
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }
    }
}
