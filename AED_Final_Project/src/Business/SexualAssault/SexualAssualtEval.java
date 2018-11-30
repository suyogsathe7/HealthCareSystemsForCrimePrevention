/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SexualAssault;

import Business.Person.Person;

/**
 *
 * @author Chinmay
 */
public class SexualAssualtEval {
    
    private int crimeAnalysisIndex;
    private int natureAnalysis;
    private int socialThreatIndex;
    private int TestResults;
    private int total;
    private Person per;
  //  private int compulsiveFactor;

    public int getCrimeAnalysisIndex() {
        return crimeAnalysisIndex;
    }

    public void setCrimeAnalysisIndex(int crimeAnalysisIndex) {
        this.crimeAnalysisIndex = crimeAnalysisIndex;
    }

    public int getNatureAnalysis() {
        return natureAnalysis;
    }

    public void setNatureAnalysis(int natureAnalysis) {
        this.natureAnalysis = natureAnalysis;
    }

  

    public int getSocialThreatIndex() {
        return socialThreatIndex;
    }

    public void setSocialThreatIndex(int socialThreatIndex) {
        this.socialThreatIndex = socialThreatIndex;
    }

    public int getTestResults() {
        return TestResults;
    }

    public void setTestResults(int TestResults) {
        this.TestResults = TestResults;
    }

   

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }
    public void CalcualteTotal()
    {
       this.total=this.TestResults+this.crimeAnalysisIndex+this.natureAnalysis+this.socialThreatIndex; 
    }

    
    
}
