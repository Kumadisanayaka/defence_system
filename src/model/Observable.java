
package model;
public interface Observable {
    
    public void notifyObserver(String area, Strength strength, String message);
    
}
