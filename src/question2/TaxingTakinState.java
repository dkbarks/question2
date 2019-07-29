/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author dkbarks
 */
public class TaxingTakinState implements IPlaneState{

    @Override
    public void previousState(Plane p) {
       p.setState(new ParkingState());
    }

    @Override
    public void nextState(Plane p) {
       p.setState(new TakingOffState());
    }

    @Override
    public String actualstate(Plane p) {
        System.out.println("the plane is taxing for TakingOff");
        return "taxing";
    }
    
}
