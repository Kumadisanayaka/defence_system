
package model;
public class SuperDefence {
    
    private boolean area;
    private String message;
    private int soldierCount;
    private int ammoCount;
    private boolean position; 
    private Observer observer;

    public SuperDefence(boolean area, String message, int soldierCount, int ammoCount, boolean position,Observer observer) {
        this.area = area;
        this.message = message;
        this.soldierCount = soldierCount;
        this.ammoCount = ammoCount;
        this.position = position;
        this.observer = observer;
    }

    public SuperDefence() {
        
    } 

    /**
     * @return the area
     */
    public boolean isArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(boolean area) {
        this.area = area;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the soldierCount
     */
    public int getSoldierCount() {
        return soldierCount;
    }

    /**
     * @param soldierCount the soldierCount to set
     */
    public void setSoldierCount(int soldierCount) {
        this.soldierCount = soldierCount;
    }

    /**
     * @return the ammoCount
     */
    public int getAmmoCount() {
        return ammoCount;
    }

    /**
     * @param ammoCount the ammoCount to set
     */
    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    /**
     * @return the position
     */
    public boolean isPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(boolean position) {
        this.position = position;
    }

    /**
     * @return the observer
     */
    public Observer getObserver() {
        return observer;
    }

    /**
     * @param observer the observer to set
     */
    public void setObserver(Observer observer) {
        this.observer = observer;
    }
    
}
