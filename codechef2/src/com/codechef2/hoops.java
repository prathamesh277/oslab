package com.codechef2;

import javax.swing.*;
import java.util.Scanner;

public class hoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-->0)
        {
            int n=sc.nextInt();
                n++;
                n=n/2;
            System.out.println(n);
        }
    }
}
