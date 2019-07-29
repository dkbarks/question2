/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author dkbarks
 */
public class ControlTower {
    
    private Queue<Plane> landingQueue = new LinkedList<Plane>();
    private Queue<Plane> takinOffQueue = new LinkedList<Plane>();
    private String name;
    private static ControlTower controlTower;
    
    public static ControlTower getControlTower(String name){
        if (controlTower==null) {
        controlTower=new ControlTower(name);
        }
        return controlTower;
    }
    
    private ControlTower(String name){
    this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void requestLanding(Plane p){
    landingQueue.add(p);
     System.out.println("request for landing received from " + p.getName());
    }
    
    public void requestTakingOff(Plane p){
    takinOffQueue.add(p);
     System.out.println("request for takinOff received from " + p.getName());
    }
    
    public void responseLanding(Runway r){
      if(!r.isOccupied()){
        for (Iterator i = landingQueue.iterator(); i.hasNext();) {
         FlyingPlane flyp = null;
         try{
             flyp =   (FlyingPlane) i.next();
         }catch(Exception e){
             System.out.println("end of queue");}
         r.setOccupied(true);
         System.out.println("start landing plane " + flyp.getName());
         while(!flyp.printStatus().equals("parking")){
             
             flyp.printStatus();
             flyp.nextState();
         }
         r.setOccupied(false);
         
        }
      }
    }
    
    public void responseTaking(Runway r){
      if(!r.isOccupied()){
        for (Iterator i = takinOffQueue.iterator(); i.hasNext();) {
        ParkedPlane flyp = null;    
        try{
        flyp =  (ParkedPlane) i.next();
        }catch(Exception e){
            System.out.println("end of queue");                
        }
         r.setOccupied(true);
         System.out.println("start takinOff plane " + flyp.getName());
         while(!flyp.printStatus().equals("flying")){
             flyp.printStatus();
             flyp.nextState();
         }
         r.setOccupied(false);
        }
      }
    }
}
