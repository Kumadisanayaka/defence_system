
package model;
public class Tank extends SuperDefence implements Observable{
    
    private int oxigen;

    public Tank() {
    }

    public Tank(int oxigen) {
        this.oxigen = oxigen;
    }

    public Tank(int oxigen, boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        super(area, message, soldierCount, ammoCount, position, observer);
        this.oxigen = oxigen;
    }
    
    @Override
    public void notifyObserver(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer) {
        observer.updateInfo(this, area, message, soldierCount, ammoCount, position);
    }
    
    
}
