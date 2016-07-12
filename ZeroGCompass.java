package com.company;

/**
 * Created by Vontre on 6/29/2016.
 */
public class ZeroGCompass {

    StarLoc sl = new StarLoc();
    GyroScope gs = new GyroScope();
    Speed spd = new Speed();
    String direction;
    double dist;
    double homeLoc = 0;
    double distanceFromHome;

    double SensorMeasurement() {
        dist = 0;

        dist = dist + (spd.mph / 10);

        return dist;
    }

    double HomeStretch(double d)
    {

        double counter = 0;

        for(double i = 0; i < d ; i++)
        {
            counter = counter + 100;
        }

        distanceFromHome = counter;
        return distanceFromHome;
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
