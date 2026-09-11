
package model;
public class SuperDefence {
    
    private String area;
    private Strength strength;
    private String message;

    public SuperDefence(String area, Strength strength, String message) {
        this.area = area;
        this.strength = strength;
        this.message = message;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setStrength(Strength strength) {
        this.strength = strength;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getArea() {
        return area;
    }

    public Strength getStrength() {
        return strength;
    }

    public String getMessage() {
        return message;
    }
    
}
