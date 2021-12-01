package com.codechef2;

import java.util.Scanner;

public class lang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            if((a1==a||a1==b) && (b1==b||b1==a))
                System.out.println("1");
            else if((a2==a||a2==b) &&(b2==b||b2==a))
                System.out.println("2");
            else
                System.out.println("0");
        }
    }
}
