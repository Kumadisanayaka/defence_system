
package model;
public class Helicopter extends SuperDefence implements Observable{

    public Helicopter(String area, Strength strength, String message) {
        super(area, strength, message);
    }

    @Override
    public void notifyObserver(String area, Strength strength, String message) {
        
        
    }
    
    
    
}
