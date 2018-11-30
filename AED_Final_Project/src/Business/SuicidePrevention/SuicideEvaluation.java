/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SuicidePrevention;

import Business.Person.Person;

/**
 *
 * @author Chaitanya
 */
public class SuicideEvaluation {
    //private Person person;
    private int environmentalFactors; //25
    private int historicalFactors; //20
    private int healthFactors; //35
    private int externalFactors; //10
    private int vitalSignsFactor; //10 
    private int suicideThreatIndex; // 56/100

    public int getSuicideThreatIndex() {
        return suicideThreatIndex;
    }

    public void setSuicideThreatIndex(int suicideThreatIndex) {
        this.suicideThreatIndex = suicideThreatIndex;
    }
    public int getVitalSignsFactor() {
        return vitalSignsFactor;
    }

    public void setVitalSignsFactor(int vitalSignsFactor) {
        this.vitalSignsFactor = vitalSignsFactor;
    }

    
    public int getExternalFactors() {
        return externalFactors;
    }

    public void setExternalFactors(int externalFactors) {
        this.externalFactors = externalFactors;
    }
    public SuicideEvaluation() {
   // person=new Person();
    }

    public int getEnvironmentalFactors() {
        return environmentalFactors;
    }

    public void setEnvironmentalFactors(int environmentalFactors) {
        this.environmentalFactors = environmentalFactors;
    }

    public int getHistoricalFactors() {
        return historicalFactors;
    }

    public void setHistoricalFactors(int historicalFactors) {
        this.historicalFactors = historicalFactors;
    }

    public int getHealthFactors() {
        return healthFactors;
    }

    public void setHealthFactors(int healthFactors) {
        this.healthFactors = healthFactors;
    }
    public void CalculateSuicideThreatIndex()
    {
     this.suicideThreatIndex=environmentalFactors+historicalFactors+healthFactors+externalFactors+vitalSignsFactor;
     
    }
}
