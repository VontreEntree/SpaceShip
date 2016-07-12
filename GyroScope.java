package com.company;

import java.util.Scanner;

/**
 * Created by Vontre on 6/29/2016.
 */
public class GyroScope{
    Scanner reader = new Scanner(System.in);

    String roll = "-";
    double rollDegrees = 0;
    String pitch = "-";
    double pitchDegrees = 0;
    String yaw = "-";
    double yawDegrees = 0;

    String direct = "";

    double YawAdjust()
    {
        System.out.println("Do you want to turn Left or Right?");
        yaw = reader.nextLine();
        switch(yaw) {
            case "Left":
                System.out.println("Okay, how far Left would you like to go? (Degrees)");
                yawDegrees = reader.nextDouble();
                System.out.println("You have changed the yaw to the left by " + yawDegrees + " degrees");
            break;
            case "Right":
                System.out.println("Okay, how far Right would you like to go? (Degrees)");
                yawDegrees = reader.nextDouble();
                System.out.println("You have changed the yaw to the right by " + yawDegrees + " degrees");
            break;
            default:
                break;
        }
        return yawDegrees;
    }

    double PitchAdjust()
    {
        System.out.println("Do you want to go Up or Down");
        pitch = reader.nextLine();
        switch(pitch) {
            case "Up":
                System.out.println("Okay, how far Up would you like to go? (Degrees)");
                pitchDegrees = reader.nextDouble();
                System.out.println("You have changed the pitch upwards by " + pitchDegrees + " degrees");
            break;
            case "Down":
                System.out.println("Okay, how far Down would you like to go? (Degrees)");
                pitchDegrees = reader.nextDouble();
                System.out.println("You have changed the pitch downwards by " + pitchDegrees + " degrees");
            break;
            default:
                break;
        }
        return pitchDegrees;
    }

    double RollAdjust()
    {
        System.out.println("Do you want to rotate Left or Right?");
        roll = reader.nextLine();
        switch(roll)
        {
            case "Left":
                System.out.println("Okay, how far Left would you like to rotate? (Degrees)");
                rollDegrees = reader.nextDouble();
                System.out.println("You have changed the by rotating to the left by " + rollDegrees + " degrees");
            break;
            case "Right":
                System.out.println("Okay, how far Right would you like to rotate? (Degrees)");
                rollDegrees = reader.nextDouble();
                System.out.println("You have changed the axis by rotating to the right by " + rollDegrees + " degrees");
            break;
            default:
                break;
        }
        return rollDegrees;
    }

    void ChangeInDirection()
    {
        System.out.println("Would you like to adjust the Yaw(Left/Right), Pitch(Up/Down)?\nOr would you like to rotate?(Rotate)");

        direct = reader.nextLine();

        switch(direct)
        {
            case "Yaw":
                YawAdjust();
                break;
            case "Pitch":
               PitchAdjust();
                break;
            case "Rotate":
               RollAdjust();
                break;
            default:
                break;

        }
    }
}
