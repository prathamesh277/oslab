package com.codechef2;

import java.util.Scanner;

public class socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b|| b==c ||c==a)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
    }
}
