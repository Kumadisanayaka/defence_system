
package model;
public class Helicopter extends SuperDefence implements Observable{

    public Helicopter() {
        
    }

    public Helicopter(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        super(area, message, soldierCount, ammoCount, position, observer);
    }

    @Override
    public void notifyObserver(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        
        observer.updateInfo(this, area, message, soldierCount, ammoCount, position);

    }
 }
