package com.codechef2;

import java.util.Scanner;

public class ballons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a=0,b=0;
        while (t-->0)
        {
            String s = sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a')
                    a++;
                else
                    b++;
            }

            if(a==b)
            {
                System.out.println(a);
            }
            else if(a==0 || b==0)
                System.out.println("0");
            else if(a>b)
                System.out.println(b);
            else if(b>a)
                System.out.println(a);
            a=0;
            b=0;
        }
    }
}
