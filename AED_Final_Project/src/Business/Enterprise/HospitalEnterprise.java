/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.DrugRecord.DrugRecordDirectory;
import Business.MedicalRecord.MedicalRecordDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class HospitalEnterprise extends Enterprise{
    private MedicalRecordDirectory medicRecDir;
    private DrugRecordDirectory drugDir;

    public DrugRecordDirectory getDrugDir() {
        return drugDir;
    }

    public void setDrugDir(DrugRecordDirectory drugDir) {
        this.drugDir = drugDir;
    }
    
    

    public MedicalRecordDirectory getMedicalRecordDir() {
        return medicRecDir;
    }

    public void setMedicalRecordDir(MedicalRecordDirectory medicalRecord) {
        this.medicRecDir = medicalRecord;
    }
    
    public HospitalEnterprise(String name) {
        super(name,Enterprise.ErpType.Hospital);
      medicRecDir=new MedicalRecordDirectory();
      drugDir = new DrugRecordDirectory();
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
