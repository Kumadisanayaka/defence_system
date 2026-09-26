
package model;
public class Submarine extends SuperDefence implements Observable{

    public Submarine() {
        
    }

    public Submarine(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        
        super(area, message, soldierCount, ammoCount, position, observer);
        
    }
    
    @Override
    public void notifyObserver(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        observer.updateInfo(this, area, message, soldierCount, ammoCount, position);
    
    }
    
}
