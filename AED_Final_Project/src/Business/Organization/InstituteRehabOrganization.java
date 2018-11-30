/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MedicalRecord.MedicalRecordDirectory;
import Business.Role.InstituteRehabOfficer;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chinmay
 */
public class InstituteRehabOrganization extends Organization{
     private String orgName;
   // private MedicalRecordDirectory medicalRecDir;

//    public MedicalRecordDirectory getMedicalRecDir() {
//        return medicalRecDir;
//    }
//
//    public void setMedicalRecDir(MedicalRecordDirectory medicalRecDir) {
//        this.medicalRecDir = medicalRecDir;
//    }
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public InstituteRehabOrganization(String name) {
        super(Organization.OrgType.Lab.getValue(),name);
        //old-->
        //super(Organisation.orgType.Doctor.getValue());
        //medicalRecDir=new MedicalRecordDirectory();
         this.orgName=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
       roles.add(new InstituteRehabOfficer());
        return roles;
    }

    
}
