/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MedicalRecord.MedicalRecordDirectory;
import Business.Role.Counsellor;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suyog Sathe
 */
public class CounsellorOrganization extends Organization{

    private String orgName;
    
    public CounsellorOrganization(String name) {
        super(Organization.OrgType.CounsellerOrganization.getValue(),name);
        
         this.orgName=name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles=new ArrayList<>();
       roles.add(new Counsellor());
        return roles;
    }
    
}
