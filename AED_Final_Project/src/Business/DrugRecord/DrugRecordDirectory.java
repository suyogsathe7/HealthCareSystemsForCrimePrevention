/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugRecord;

import java.util.ArrayList;

/**
 *
 * @author Suyog Sathe
 */
public class DrugRecordDirectory {
    private ArrayList<DrugRecord> listDrugRecord;

    public DrugRecordDirectory() {
        listDrugRecord = new ArrayList<>();
    }

    public ArrayList<DrugRecord> getListDrugRecord() {
        return listDrugRecord;
    }

    public void setListDrugRecord(ArrayList<DrugRecord> listDrugRecord) {
        this.listDrugRecord = listDrugRecord;
    }
    
    public DrugRecord addDrugRecord()
    {
        DrugRecord dr = new DrugRecord();
        listDrugRecord.add(dr);
        return dr;
    }
    
    public void deleteDrugRecord(DrugRecord dr)
    {
        listDrugRecord.remove(dr);
    }
}
