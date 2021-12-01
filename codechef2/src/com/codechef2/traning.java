package com.codechef2;

import java.util.Scanner;

public class traning {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int ascii = 0;
        long count=0;
        int m=0;
        while(t-->0)
        {
            String s= sc.next();
            int arr[]=new int[s.length()];
            for(int i=0;i<s.length();i++)
            {
                arr[i]=s.charAt(i);
                 ascii=arr[i];
                int ans=(ascii-96);
                count*=26L;
                count+=ans;

            }
            System.out.println(count);
        }
    }
}
