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
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControlTower eldorado = ControlTower.getControlTower("El Dorado");
        Runway landingRunway = new Runway(false);
        Runway takinOffRunway = new Runway(false);
        
        FlyingPlane fp1 = new FlyingPlane();
        fp1.setName("av1201");
        FlyingPlane fp2 = new FlyingPlane();
        fp2.setName("av2503");
        FlyingPlane fp3 = new FlyingPlane();
        fp3.setName("av3120");
        
        ParkedPlane pp1 = new ParkedPlane();
        pp1.setName("da0001");
        ParkedPlane pp2 = new ParkedPlane();
        pp2.setName("da1035");
        ParkedPlane pp3 = new ParkedPlane();
        pp3.setName("da2024");

        eldorado.requestLanding(fp1);
        eldorado.requestLanding(fp2);
        eldorado.requestLanding(fp3);
        
        eldorado.requestTakingOff(pp1);
        eldorado.requestTakingOff(pp2);
        eldorado.requestTakingOff(pp3);
        
        eldorado.responseLanding(landingRunway);
        eldorado.responseTaking(takinOffRunway);
    }
    
}
