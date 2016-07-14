package com.company;

import java.util.Scanner;

/**
 * Created by Vontre on 6/29/2016.
 */
public class Speed {
    //Scanner reader = new Scanner(System.in);

    double mph = 0;


    double SpeedUp(double increment)
    {
        for(double i = 0; i < increment; i++)
        {
            mph = mph + 10;
        }
        return mph;
    }

    double SlowDown(double decrement)
    {
       for(double j = 0; j < decrement; j++)
       {
           mph = mph - 10;
       }
        return mph;
    }
}
