/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class DoctorOrganization extends Organization{
     private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public DoctorOrganization(String name) {
        super(Organization.OrgType.Doctor.getValue(),name);
        //old-->
        //super(Organisation.orgType.Doctor.getValue());
         this.orgName=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
       roles.add(new DoctorRole());
        return roles;
    }
}
