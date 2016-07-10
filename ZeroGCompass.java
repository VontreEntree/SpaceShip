package com.company;

/**
 * Created by Vontre on 6/29/2016.
 */
public class ZeroGCompass extends Sensor {

    StarLoc sl = new StarLoc();
    GyroScope gs = new GyroScope();
    Speed spd = new Speed();
    String direction;
    double dist;
    double homeLoc = 0;
    double distanceFromHome;

    void SensorMeasurement() {
        dist = dist + (spd.mph / 10);
    }


    void DirectionOfSun()
    {
        if(gs.direct == "Yaw" && gs.yaw == "Left")
        {

        }
        else if(gs.direct == "Yaw" && gs.yaw == "Right")
        {

        }

        if(gs.direct == "Roll" && gs.yaw == "Left")
        {

        }
        else if(gs.direct == "Roll" && gs.yaw == "Right")
        {

        }

        if(gs.direct == "Pitch" && gs.yaw == "Up")
        {

        }
        else if(gs.direct == "Pitch" && gs.yaw == "Down")
        {

        }
    }
}
