package com.codechef2;

import java.util.Scanner;

public class mass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m =sc.nextInt();
            int h =sc.nextInt();
            int b=m/(h*h);
            if(b<=18)
                System.out.println(1);
            else if(b>=19 &&b<=24)
                System.out.println("2");
            else if(b>=25 && b<=29)
                System.out.println("3");
            else if(b>=30)
                System.out.println("4");
        }
    }
}
