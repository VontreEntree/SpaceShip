package com.company;

import java.util.*;

/**
 * Created by Vontre on 6/29/2016.
 */
public class Sensor {

    Vector vec = new Vector();

    Movement move = new Movement();
    StarLoc starloc = new StarLoc();
    Speed spd = new Speed();
    Accelerator acl = new Accelerator();
    GyroScope gs = new GyroScope();
    ZeroGCompass zero_g = new ZeroGCompass();



    void vectorMethod()
    {
        speedVector();
        aclVector();
        starVector();
        zeroGVector();
        gyroVector();

    }


    void speedVector()
    {
        vec.addElement(spd.mph);
    }

    void aclVector()
    {
        vec.addElement(acl.accelCount);
    }

    void starVector()
    {
        vec.addElement(starloc.star);
        vec.addElement(starloc.milesFS);
    }

    void zeroGVector()
    {
        vec.addElement(zero_g.distanceFromHome);
    }

    void gyroVector()
    {
        vec.addElement(gs.direct);
        vec.addElement(gs.yaw);
        vec.addElement(gs.yawDegrees);
        vec.addElement(gs.roll);
        vec.addElement(gs.rollDegrees);
        vec.addElement(gs.pitch);
        vec.addElement(gs.pitchDegrees);
    }


  void displayVector()
    {
        Enumeration en = vec.elements();

        System.out.println("\nCurrent Sensor Info");
        while(en.hasMoreElements())
        {
            System.out.print("\n" + en.nextElement());
          
        }
    }


    void sensorCheck()
    {
        move.SensorMeasurement();

    }

    void SensorInfo()
    {

        for(int i = 0; i < vec.size(); i++) {

            //Displays the current info for the ship
            switch(i) {
                case 1:
                System.out.println("\n~~~~~Current Sensor Status~~~~~");
                System.out.println("Speed: " + vec.get(1));
                    break;

                case 2:
                System.out.println("Acceleration: " + vec.get(2));
                    break;

                case 3:
                System.out.println("\n~~~~~Current Star Status~~~~~");
                System.out.println("Closest Star: " + vec.get(3));
                    break;

                case 4:
                System.out.println("Distance from Star: " + vec.get(4));
                System.out.println("Temperature: " + starloc.DisplayTemp());
                    break;

                case 5:
                System.out.println("Distance from Home: " + vec.get(5));
                    break;

                case 6:
                System.out.println("\n~~~~~Latest GyroScope Update~~~~~");
                System.out.println("Updated Direction: Turned " + vec.get(6));
                    break;

                case 7:
                System.out.println("Updated Yaw: " + vec.get(7) + " " + vec.get(8));
                    break;

                case 8:
                System.out.println("Updated Roll: " + vec.get(9) + " " + vec.get(10));
                    break;

                case 9:
                System.out.println("Updated Pitch: " + vec.get(11) + " " + vec.get(12));
                    break;

                default:
                    break;
            }
        }





    }
}
