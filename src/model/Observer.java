
package model;
public interface Observer {
    
    public void updateInfo(SuperDefence unit, boolean area, String message, int soldierCount, int ammoCount, boolean position);

}
