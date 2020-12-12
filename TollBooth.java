/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author SHAOLI GHOSH
 */
class TollBooth {
    boolean inUse;
    public TollBooth()
    {
        inUse=false;
    }
    public void useToll(Vehicle vehicle)
    {
        while(true)
        {
            if(inUse==false)
            {
                synchronized(this)
                {
                        inUse=true;
                        System.out.println("Vehicle "+(vehicle.getVehicleId()+1)+" enters tollbooth");
                        vehicle.travel(50); //vehicle spends 50 time units in the toll booth
                        System.out.println("Vehicle "+(vehicle.getVehicleId()+1)+" exits tollbooth");
                        inUse=false;
                        break;
                        
                }
            }
        }
    }
    
}
