package com.company;

import java.util.Random;


/**
 * Created by Vontre on 6/29/2016.
 */
public class StarLoc extends ZeroGCompass{

    Random rnd = new Random();

    double milesFS;
    double maxSunTemp;
    double minSunTemp;
    double sunTemp;
    boolean isThreat;

String[] starNames = {"Aludra", "Merope", "Pherkad", "Zavijava", "Terebellum"};

    String star;

    int RandomStar()
    {
        int randomS = rnd.nextInt((10 - 1) + 1) + 1;
        //System.out.println(starNames[(String)(Math.random() * starNames.length)]);
        return randomS;
    }

    String StarName()
    {
        star = starNames[rnd.nextInt() % 5];
        System.out.println("Approaching " + star);
        return star;
    }




    double StarDistance()
    {
      switch(RandomStar())
      {
          case 1:
              milesFS = 100000;
              break;
          case 3:
              milesFS = 80000;
              break;
          case 5:
              milesFS = 60000;
              break;
          case 7:
              milesFS = 40000;
              break;
          case 9:
              milesFS = 20000;
              break;
          case 10:
              milesFS = 0;
              break;
          default:
              milesFS = milesFS / 2;
              break;
      }
return milesFS;
    }

    void  SunTempCalc()
    {

        switch(star)
        {
            case "Aludra":
                maxSunTemp = 400000;
                minSunTemp = 80000;
                sunTemp = 200000;
                break;
            case "Merope":
                maxSunTemp = 6000000;
                minSunTemp = 1200000;
                sunTemp = 3000000;
                break;
            case "Pherkad":
                maxSunTemp = 90000;
                minSunTemp = 18000;
                sunTemp = 45000;
                break;
            case "Zavijava":
                maxSunTemp = -120000;
                minSunTemp = -24000;
                sunTemp = -60000;
                break;
            case "Terebellum":
                maxSunTemp = 666666.6;
                minSunTemp = 133333.32;
                sunTemp = 333333.3;
                break;
        }

    }

    double DisplayTemp()
    {

        double testTemp = 0;

        if(milesFS == 100000)
        {

            testTemp = minSunTemp;

        }
        if(milesFS == 80000)
        {
            testTemp = (minSunTemp * 2);

        }
        if(milesFS == 60000)
        {
            testTemp =  sunTemp;

        }
        if(milesFS == 40000)
        {
            testTemp = (sunTemp + minSunTemp);

        }
        if(milesFS == 20000)
        {
            testTemp = (maxSunTemp - minSunTemp);

        }
        if(milesFS == 0)
        {
            testTemp = maxSunTemp;

        }

        return testTemp;
    }

    void DangerMessage()
    {
      if(milesFS == 100000)
      {
          System.out.println("Current Distance: " + milesFS);
          System.out.println("You are a fair distance away from " + star);
          SunTempCalc();
      }
        if(milesFS == 80000)
        {
            System.out.println("Current Distance: " + milesFS);
            System.out.println("You are closing in on " + star);
            SunTempCalc();
        }
        if(milesFS == 60000)
        {
            System.out.println("Current Distance: " + milesFS);
            System.out.println("You are really close to " + star);
            SunTempCalc();
        }
        if(milesFS == 40000)
        {
            System.out.println("Current Distance: " + milesFS);
            System.out.println("You should consider turning back");
            SunTempCalc();
        }
        if(milesFS == 20000)
        {
            System.out.println("Current Distance: " + milesFS);
            System.out.println("You are dangerously close, the sensors are malfunctioning from " + star + "'s temperature");
            SunTempCalc();
        }
        if(milesFS == 0)
        {
            System.out.println("Current Distance: Null");
            System.out.println(star + "'s intense gravitation pulled you in until you collided with it");
            SunTempCalc();
        }

    }
}
