package com.company;

import java.util.Scanner;

/**
 * Created by Vontre on 6/29/2016.
 */
public class Accelerator extends Movement{
    Scanner reader = new Scanner(System.in);

    int accelCount = 0;
    int counter = 0;

   // boolean isTraveling;


    void SpeedAdjustment()
    {
        System.out.println("Would you like to speed up(1), slow down(2) or maintain current speed(0)?");

        counter = reader.nextInt();
    }
    int Acceleration(int counter)
    {
        //double counter;


      switch(counter)
      {
          case 1:
              System.out.println("How much would you like to speed up?(1 - 10)");
              accelCount = reader.nextInt();
              break;
          case 2:
              System.out.println("How much would you like to slow down?(1 - 10)");
              accelCount = reader.nextInt();
              break;
          case 0:
              System.out.println("Current speed will not be adjusted");
              accelCount = 0;
              break;
          default:
              break;
      }
        return accelCount;
    }
}
