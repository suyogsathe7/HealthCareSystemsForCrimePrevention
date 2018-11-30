/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.Role;
import Business.SuicidePrevention.Report;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class SuicideAwarenessEnterprise extends Enterprise{
   private Report report;
  
    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
    
    public SuicideAwarenessEnterprise(String name) {
         super(name,Enterprise.ErpType.SuicideAwareness);
         //lstSuicideEvaluation=new ArrayList<>();
         report=new Report();
    }
   //private ArrayList<SuicideEvaluation> lstSuicideEvaluation;

//    public ArrayList<SuicideEvaluation> getLstSuicideEvaluation() {
//        return lstSuicideEvaluation;
//    }
//
//    public void setLstSuicideEvaluation(ArrayList<SuicideEvaluation> lstSuicideEvaluation) {
//        this.lstSuicideEvaluation = lstSuicideEvaluation;
//    }
    
//    public SuicideAwarenessEnterprise()
//    {
//        lstSuicideEvaluation=new ArrayList<>();
//    }
   @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
//    public SuicideEvaluation CreateSuicideEvaluation()
//    {
//        SuicideEvaluation se=new SuicideEvaluation();
//        lstSuicideEvaluation.add(se);
//        return se;
//    }
}
