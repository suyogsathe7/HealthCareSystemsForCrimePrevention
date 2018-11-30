/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.FamilyMember;
import Business.Role.Role;
import Business.Role.SocialWorker;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class FamilyCareOrganization extends Organization{

    private String orgName;
    
    private ArrayList<FamilyMember> lstFamilyMembers;

    public ArrayList<FamilyMember> getLstFamilyMembers() {
        return lstFamilyMembers;
    }

    public void setLstFamilyMembers(ArrayList<FamilyMember> lstFamilyMembers) {
        this.lstFamilyMembers = lstFamilyMembers;
    }
    
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public FamilyCareOrganization(String name)
    {
         super(Organization.OrgType.Lab.getValue(),name);
        //old-->
        //super(Organisation.orgType.Doctor.getValue());
        //lstDependants=new ArrayList<Object>
        lstFamilyMembers=new ArrayList<>();
         this.orgName=name;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> lstRoles=new ArrayList<>();
      lstRoles.add(new SocialWorker());
      return lstRoles;
    }
    public FamilyMember addFamilyMember()
    {
        FamilyMember fm=new FamilyMember();
        lstFamilyMembers.add(fm);
        return fm;
    }
}
