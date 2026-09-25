
package controller;

import java.util.ArrayList;
import model.Observer;
import model.SuperDefence;

public class MainController implements Observer{
    
    private ArrayList<SuperDefence> depenceUnit = new ArrayList<>();

    public void addDepenceUnitObserver(SuperDefence ob){
        
        if(ob != null){
            depenceUnit.add(ob);
        }
    } 
    
    public void updateArea(boolean area){
         
        for (SuperDefence superDefence : depenceUnit) {
            
            superDefence.setArea(area);
            
        }
        
    }
    
    public void resiveMessege(String message){
    
        for (SuperDefence superDefence : depenceUnit) {
            
            superDefence.setMessage(message);
            
        }
    }

    @Override
    public void updateInfo(SuperDefence unit, boolean area, String message, int soldierCount, int ammoCount, boolean position) {
    
    }
}
