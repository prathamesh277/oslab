package com.codechef2;

import java.util.Arrays;
import java.util.Scanner;

public class Pairme {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        int sum=0;
        int ans=0;
        while(t-->0)
        {
            int arr[]= new int[3];
            for(int i=0;i<3;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<3;i++)
            {
//                System.out.println(arr[i]);
                sum=arr[1]+arr[0];
                ans=arr[2];
            }
            if(sum==ans)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
