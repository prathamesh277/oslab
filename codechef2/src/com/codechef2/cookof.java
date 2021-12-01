package com.codechef2;

import java.util.Scanner;

public class cookof {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int count0=0;
            int arr[]=new int[5];
            for(int i=0;i< arr.length;i++)
            {
                arr[i]=sc.nextInt();

                if(arr[i]==1)
                    count0++;
            }
            System.out.println(count0);
            switch (count0) {
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
            }
        }
    }
}
