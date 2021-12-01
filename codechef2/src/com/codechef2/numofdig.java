package com.codechef2;

import java.util.Scanner;

public class numofdig {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            count++;
        }
        if(count==1)
            System.out.println("1");
        else if(count==2)
            System.out.println("2");
        else if(count==3)
            System.out.println("3");
        else
            System.out.println("More than 3 digits");
    }
}
