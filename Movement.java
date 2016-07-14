package com.company;

import java.util.Scanner;

/**
 * Created by Vontre on 6/29/2016.
 */
public class Movement{
    Scanner reader = new Scanner(System.in);

    Speed spd = new Speed();
    Accelerator acl = new Accelerator();
    GyroScope gs = new GyroScope();

    int flightControl;

    void SensorMeasurement()
    {
        System.out.println("Would you like to adjust the speed(1), direction(2) or quit(0)?");
        flightControl = reader.nextInt();

        switch(flightControl)
        {
            case 0:
                System.out.println("You have decided to abandon your mission and" +
                        "\nattempted to land on a nearby planet." +
                        "\nWhile landing you were decimated by the planets" +
                        "\nfierce extraterrestrial artillery");

                System.exit(0);
                break;
            case 1:

                acl.SpeedAdjustment();
                switch(acl.counter)
                {
                    case 1:
                        System.out.println("\nCurrent speed is " + spd.mph + " mph");
                        spd.mph = spd.SpeedUp(acl.Acceleration(acl.counter));
                        System.out.println("Speed has increased to " + spd.mph + " mph");


                        break;
                    case 2:
                        System.out.println("\nCurrent speed is " + spd.mph + " mph");
                        spd.mph = spd.SlowDown(acl.Acceleration(acl.counter));
                        System.out.println("Speed has decreased to " + spd.mph + " mph");
                        break;
                }
                break;
            case 2:
                gs.ChangeInDirection();
                break;
            default:
                break;
        }
    }
}
