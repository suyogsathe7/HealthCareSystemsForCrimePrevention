/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CriminalRecord.CriminalRecordDirectory;
import Business.Role.PoliceOfficer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class PoliceDepartmentOrganization extends Organization{

    private String orgName;
    private CriminalRecordDirectory criminalRecDir;
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public PoliceDepartmentOrganization(String name) {
        super(Organization.OrgType.PoliceDepartment.getValue(),name);
        //old-->
        //super(Organisation.orgType.Doctor.getValue());
        criminalRecDir=new CriminalRecordDirectory();
         this.orgName=name;
    }

    public CriminalRecordDirectory getCriminalRecDir() {
        return criminalRecDir;
    }

    public void setCriminalRecDir(CriminalRecordDirectory criminalRecDir) {
        this.criminalRecDir = criminalRecDir;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
       roles.add(new PoliceOfficer());
        return roles;  
    }
    
}
