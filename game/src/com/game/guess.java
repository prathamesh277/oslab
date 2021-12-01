package com.game;

import java.util.Scanner;

public class guess {
    public static void Game(int i)
    {
        int random = (int)(Math.random()*50);
        Scanner sc = new Scanner(System.in);

        System.out.println("You have "+ i+ " chances to guess");
        int count =i;
        int level = 0;
        while(count!=0)
        {
            int user = sc.nextInt();
            if(user==random)
            {
                System.out.println("Correct Answer");
                System.out.println("You have cleared Level 1");
                level++;
                break;
            }
            else if(user>random)
            {
                System.out.println("The number is too large");
            }
            else if(user<random)
            {
                System.out.println("The number is too small ");
            }
            count--;
            System.out.println("You have left "+ count + " turns");
            if(count==0)
            {
                System.out.println("You lost");
                break;
            }

        }

        System.out.println("The number is :"+random);

    }
    public static void main(String[] args) {
        System.out.println("Select difficulty");
        System.out.println("1.Easy");
        System.out.println("2.Medium");
        System.out.println("3.Hard");
        int diff ;
        Scanner sc = new Scanner(System.in);
        diff =sc.nextInt();
        switch(diff)
        {
            case 1:
                Game(15);
                break;
            case 2:
                Game(10);
                break;
            case 3:
                Game(5);
                break;
        }
    }
}
