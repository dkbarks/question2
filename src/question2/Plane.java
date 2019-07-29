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
public class Plane {
    
    private String name;
    private IPlaneState state;

    public IPlaneState getState() {
        return state;
    }

    public void setState(IPlaneState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
