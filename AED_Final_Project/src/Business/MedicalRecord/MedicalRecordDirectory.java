/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecord;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class MedicalRecordDirectory {
    private ArrayList<MedicalRecord> lstMedicalRecord;
    
    public MedicalRecordDirectory()
    {
        lstMedicalRecord=new ArrayList<>();
    }

    public ArrayList<MedicalRecord> getLstMedicalRecord() {
        return lstMedicalRecord;
    }

    public void setLstMedicalRecord(ArrayList<MedicalRecord> lstMedicalRecord) {
        this.lstMedicalRecord = lstMedicalRecord;
    }
    
    public MedicalRecord addMedicalRecord()
    {
        MedicalRecord mr=new MedicalRecord();
        lstMedicalRecord.add(mr);
        return mr;
    }
    public void removeMedicalRecord(MedicalRecord mr)
    {
        lstMedicalRecord.remove(mr);                
    }
    
}
