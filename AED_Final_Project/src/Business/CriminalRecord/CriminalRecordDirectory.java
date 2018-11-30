/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CriminalRecord;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class CriminalRecordDirectory {
    private ArrayList<CriminalRecord> lstCriminalRecord;
    public  CriminalRecordDirectory()
    {
    lstCriminalRecord=new  ArrayList<>();
    }

    public ArrayList<CriminalRecord> getLstCriminalRecord() {
        return lstCriminalRecord;
    }

    
    public void setLstCriminalRecord(ArrayList<CriminalRecord> lstCriminalRecord) {
        this.lstCriminalRecord = lstCriminalRecord;
    }
    
    public CriminalRecord addCriminalRecord()
    {
        CriminalRecord cm  = new CriminalRecord();
        lstCriminalRecord.add(cm);
        return cm;
    
    
    }
}
