/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecord;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class MedicalRecord {

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }
 private Person person;
 private VitalSign vitalSign;
 //
 private ArrayList<String> ailments;

    public ArrayList<String> getAilments() {
        return ailments;
    }

    public void setAilments(ArrayList<String> ailments) {
        this.ailments = ailments;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }
 private ArrayList<String> symptoms;
 //
 private float drugTestResults;
 private float alcoholResults;

    public float getAlcoholResults() {
        return alcoholResults;
    }

    public void setAlcoholResults(float alcoholResults) {
        this.alcoholResults = alcoholResults;
    }
    public float getDrugTestResults() {
        return drugTestResults;
    }

    public void setDrugTestResults(float drugTestResults) {
        this.drugTestResults = drugTestResults;
    }
    public MedicalRecord() {
        person=new Person();
        vitalSign=new VitalSign();
        ailments=new ArrayList<>();
        symptoms=new ArrayList<>();
    }
 
}
