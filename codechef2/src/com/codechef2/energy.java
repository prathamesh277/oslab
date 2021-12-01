package com.codechef2;

import java.util.Scanner;

public class energy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int e=sc.nextInt();
            int k=sc.nextInt();
            while(e>0)
            {
                count++;
                e=e/k;

            }
            System.out.println(count);
            count=0;
        }
    }
}
