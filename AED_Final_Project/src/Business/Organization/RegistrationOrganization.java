/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EducationOperator;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chinmay
 */
public class RegistrationOrganization extends Organization{
    private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> lstRoles=new ArrayList<>();
        lstRoles.add(new EducationOperator());
        return lstRoles;
    }

    public RegistrationOrganization(String name) {
        
        super(Organization.OrgType.Lab.getValue(),name);
        this.orgName=name;
    }
    
}
