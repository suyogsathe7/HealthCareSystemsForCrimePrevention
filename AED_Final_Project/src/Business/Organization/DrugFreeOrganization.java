/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Receptionist;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suyog Sathe
 */
public class DrugFreeOrganization extends Organization{

    private String organizationName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    public DrugFreeOrganization(String name) {
        super(Organization.OrgType.DrugFreeOrganization.getValue(),name);
        organizationName=name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
       roles.add(new Receptionist());
       //karna baaki hai
        return roles;  
    }
    
}
