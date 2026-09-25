
package model;
public interface Observable {
    
    public void notifyObserver(boolean area, String message, int soldierCount, int ammoCount, boolean position, Observer observer);
    
}
