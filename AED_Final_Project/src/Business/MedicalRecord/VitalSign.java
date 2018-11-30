/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecord;

/**
 *
 * @author Chaitanya
 */
public class VitalSign {
 private int highbloodPressure;
private int lowBloodPressure; 
 private int heartRate;
 private int metabolicRate;
 private int bodyMass;
 private int urinePH;
 private int drugTolerance;

    public int getHighbloodPressure() {
        return highbloodPressure;
    }

    public void setHighbloodPressure(int highbloodPressure) {
        this.highbloodPressure = highbloodPressure;
    }

    public int getLowBloodPressure() {
        return lowBloodPressure;
    }

    public void setLowBloodPressure(int lowBloodPressure) {
        this.lowBloodPressure = lowBloodPressure;
    }
 
    

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getMetabolicRate() {
        return metabolicRate;
    }

    public void setMetabolicRate(int metabolicRate) {
        this.metabolicRate = metabolicRate;
    }

    public int getBodyMass() {
        return bodyMass;
    }

    public void setBodyMass(int bodyMass) {
        this.bodyMass = bodyMass;
    }

    public int getUrinePH() {
        return urinePH;
    }

    public void setUrinePH(int urinePH) {
        this.urinePH = urinePH;
    }

    public int getDrugTolerance() {
        return drugTolerance;
    }

    public void setDrugTolerance(int drugTolerance) {
        this.drugTolerance = drugTolerance;
    }

   
}
