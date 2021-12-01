package com.codechef2;

import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100)
        {
            System.out.println("0");
        }
        else if(n>=50 &&n<=100)
        {
            System.out.println("50");
        }
        else if(n>=1 && n<50)
        {
            System.out.println("100");
        }
    }
}
