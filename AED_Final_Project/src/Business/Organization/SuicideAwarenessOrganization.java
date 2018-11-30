/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.SaOfficer;

import java.util.ArrayList;

/**
 *
 * @author Tari
 */
public class SuicideAwarenessOrganization extends Organization{
    private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public SuicideAwarenessOrganization(String name) {
        super(Organization.OrgType.SuicideAwarenessFoundation.getValue(),name);
        orgName=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles=new ArrayList<>();
      roles.add(new SaOfficer()); 
        return roles;  
    }
    
}
