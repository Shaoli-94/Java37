/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;
import java.util.Random;

/**
 *
 * @author SHAOLI GHOSH
 */
public class Vehicle implements Runnable
{
    private int id;
    private static TollBooth toll=new TollBooth(); //only one toll booth
    public Vehicle(int id)
    {
        //each vehicle has a different identifying number
        this.id=id;
    }
    @Override
    public void run()
    {
        System.out.println("Vehicle "+(id+1)+" starts journey");
        Random ran=new Random();
        int rnd=ran.nextInt(100);
        travel(rnd); //time taken from starting point to toll booth
        System.out.println("Vehicle "+(id+1)+" arrives at the toll");
        toll.useToll(this); //current vehicle uses toll booth
        travel(rnd); //time taken to cross bridge
        System.out.println("Vehicle "+(id+1)+" has crossed the bridge");
    }
    public int getVehicleId()
    {
        return this.id;
    }
    public void travel(int time)
    {
        int limit=500000;
        for(int j=0;j<time;j++)
        {
            for(int k=0;k<limit;k++)
            {
                //do nothing
            }
        }
    }
}
