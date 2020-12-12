/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming7_1;
import simulation.Vehicle;

/**
 *
 * @author SHAOLI GHOSH
 */
public class Programming7_1 {

   private static int noOfVehicles=5;
   private static Vehicle[] vehicles;
   
    public static void main(String[] args) {
        try
        {
            Programming7_1 obj=new Programming7_1();
            vehicles=new Vehicle[5];
            for(int i=0;i<noOfVehicles;i++)
            {
                vehicles[i]=new Vehicle(i);
                Thread t=new Thread(vehicles[i]);
                t.start();
                Thread.sleep(10);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
