
package controller;

import java.util.ArrayList;
import model.Helicopter;
import model.Observer;
import model.Submarine;
import model.SuperDefence;
import model.Tank;
import view.HelicopterView;
import view.MainView;
import view.SubmarianView;
import view.TankView;

public class MainController implements Observer{
    
    private HelicopterView helicopterView;
    private TankView tankView;
    private SubmarianView submarianView;
    private MainView mainView;
    private String unitMessage;
    private String unitName;
    
    private ArrayList<SuperDefence> depenceUnit = new ArrayList<>();

    public ArrayList<SuperDefence> getDepenceUnit() {
        return depenceUnit;
    }
    
    public void addDepenceUnitObserver(SuperDefence ob){
        
        if(ob != null){
            depenceUnit.add(ob);
        }
    } 
    
    public void setUnitMessage(String uMsg, String unitName){
    
        this.unitMessage = uMsg;
        this.unitName = unitName;
        
        mainView.displayUnitMsg();
        
  
    }
    
    public String getUnitMessage(){
    
        return unitName+" : "+unitMessage;
    }
    
  public void updateArea(boolean area){

        for (SuperDefence superDefence : depenceUnit) {
            superDefence.setArea(area);
        }

        helicopterView.refreshPage();
        tankView.refreshPage();
        submarianView.refreshPage();
        
}
    
    public void reciveMessege(String message){
    
        for (SuperDefence superDefence : depenceUnit) {
            
            superDefence.setMessage(message);
            
        }
        
        helicopterView.displayMsg();
        tankView.displayMsg();
        submarianView.displayMsg();
    }
    
    public Helicopter getHelicopter(){
        
        for (SuperDefence unit : depenceUnit) {
            
            if(unit instanceof Helicopter){
                
                return (Helicopter) unit;
            }
            
        }
        return null;
    }
    
    public Tank getTank(){
    
        for (SuperDefence unit : depenceUnit) {
            
            if(unit instanceof Tank){
                
                return (Tank) unit;
            }
            
        }
        
        return null;
    }
    
    public Submarine getSubmarine(){
        
        for (SuperDefence unit : depenceUnit) {
            
            if(unit instanceof Submarine){
                
                return (Submarine) unit;
            }
        }
        
        return null;
    }
    

    @Override
    public void updateInfo(SuperDefence unit, boolean area, String message, int soldierCount, int ammoCount, boolean position) {
    
    }
    
    public void setHelicopterView(HelicopterView helicopterView) {
        this.helicopterView = helicopterView;
    }

    public void setTankView(TankView tankView) {
        this.tankView = tankView;
    }

    public void setSubmarianView(SubmarianView submarianView) {
        this.submarianView = submarianView;
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }
    
    
}
