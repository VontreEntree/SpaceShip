package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Sensor sensor = new Sensor();

        Movement move = new Movement();
        StarLoc starloc = new StarLoc();
        Speed spd = new Speed();
        Accelerator acl = new Accelerator();
        GyroScope gs = new GyroScope();
        ZeroGCompass zero_g = new ZeroGCompass();




        do {

            sensor.sensorCheck();


            zero_g.HomeStretch(zero_g.SensorMeasurement());
            sensor.vectorMethod();
            sensor.SensorInfo();

           // sensor.displayVector();

            sensor.vec.clear();
        }while(starloc.milesFS != 0);

    }
}
