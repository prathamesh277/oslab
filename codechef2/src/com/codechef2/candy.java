package com.codechef2;

import java.util.Arrays;
import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        int count=0;
        int sout=0;
        while(t-->0)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            if(n%k==0)
            {
               count=n/k;
                System.out.println(count);
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
