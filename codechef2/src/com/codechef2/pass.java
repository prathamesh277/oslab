package com.codechef2;

import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            int z=0; int o=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='0')
                {
                    z++;
                }
                else
                {
                    o++;
                }
            }
            System.out.println((a*z)+(b*o));
        }
    }
}
