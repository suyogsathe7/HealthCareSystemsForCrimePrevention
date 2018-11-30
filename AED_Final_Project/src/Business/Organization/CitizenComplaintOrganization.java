/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Proctor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class CitizenComplaintOrganization extends Organization{

    private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public CitizenComplaintOrganization(String name)
    {
        super(Organization.OrgType.CounsellerOrganization.getValue(),name);
        this.orgName=name;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> lstRoles=new ArrayList<>();
        lstRoles.add(new Proctor());
        return lstRoles;
    }
    
}
