/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SexualAssault;

import java.util.ArrayList;

/**
 *
 * @author Chinmay
 */
public class AssaultDirectory {
    
    ArrayList<SexualAssualtEval> lstevents;
    
    public AssaultDirectory()
    {
    
      lstevents = new ArrayList<>();
    
    }

    public ArrayList<SexualAssualtEval> getLstevents() {
        return lstevents;
    }

    public void setLstevents(ArrayList<SexualAssualtEval> lstevents) {
        this.lstevents = lstevents;
    }
    
    
    
}
