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
public class FlyingPlane extends Plane {
    
    private IPlaneState state = new FlyingState();

    @Override
    public IPlaneState getState() {
        return state;
    }

    @Override
    public void setState(IPlaneState state) {
        this.state = state;
    }
    
    
    public void previousState() {
        state.previousState(this);
    }
 
    public void nextState() {
        state.nextState(this);
    }
 
    public String printStatus() {
        return state.actualstate(this);
    }
    
}
