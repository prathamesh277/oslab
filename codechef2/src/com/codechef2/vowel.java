package com.codechef2;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        char[] arr={'A','E','I','O','U'};
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==c)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
