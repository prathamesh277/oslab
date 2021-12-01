package com.codechef2;

import java.util.Scanner;

public class areaorperi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area=l*b;
        int peri=2*(l+b);
        if(area==peri) {
            System.out.println("Eq");
            System.out.println(area);
        }
        else
        {
            if(area>peri)
            {
                System.out.println("Area");
                System.out.println(area);
            }
            else
            {
                System.out.println("Peri");
                System.out.println(peri);
            }
        }

    }
}
