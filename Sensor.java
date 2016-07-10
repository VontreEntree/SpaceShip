package com.company;

/**
 * Created by Vontre on 6/29/2016.
 */
public class Sensor {

    Movement move = new Movement();
    StarLoc starloc = new StarLoc();
    Speed spd = new Speed();
    Accelerator acl = new Accelerator();
    GyroScope gs = new GyroScope();
    ZeroGCompass zero_g = new ZeroGCompass();


    void sensorCheck()
    {
        move.SensorMeasurement();

    }

    void SensorInfo()
    {
        //Displays the current info for the ship
        System.out.println("~~~~~Current Sensor Status~~~~~");
        System.out.println("Speed: " + spd.mph);
        System.out.println("Acceleration: " + acl.accelCount);

        System.out.println("~~~~~Current Star Status~~~~~");
        System.out.println("Closest Star: " + starloc.star);
        System.out.println("Distance: " + starloc.milesFS);
        System.out.println("Temperature: " + starloc.DisplayTemp());
    }
}
