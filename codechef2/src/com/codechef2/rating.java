package com.codechef2;

import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n =sc.nextInt();
            if(n>=2000)
            {
                System.out.println("1");
            }
            else if(n<2000 &&n>=1600)
            {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        }
    }
}
