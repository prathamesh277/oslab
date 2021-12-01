package com.codechef2;

import java.util.Scanner;

public class candyone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=0;
            while(a1<a || a1<b)
            {
             a1++;
            }
            if(a1>a)
                System.out.println("bob");
            else
                System.out.println("limak");
            a1=0;
        }
    }
}
