/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugAbuseControl;

import java.util.ArrayList;

/**
 *
 * @author Suyog Sathe
 */
public class DrugReport {
  private ArrayList<DrugEvaluation> lstDrugEvaluation;

    public ArrayList<DrugEvaluation> getLstDrugEvaluation() {
        return lstDrugEvaluation;
    }

    public void setLstDrugEvaluation(ArrayList<DrugEvaluation> lstDrugEvaluation) {
        this.lstDrugEvaluation = lstDrugEvaluation;
    }

    public DrugReport() {
        lstDrugEvaluation=new ArrayList<>();
    }
    public void addDrugEvaluation(DrugEvaluation de)
    {
        lstDrugEvaluation.add(de);
    }
    public void removeDrugEvaluation(DrugEvaluation de)
    {
        lstDrugEvaluation.remove(de);
    }
    
    
  
}
