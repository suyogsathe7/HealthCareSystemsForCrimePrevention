/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrgType;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class OrganizationDirectory {
    private ArrayList<Organization> lstOrganization;

    public OrganizationDirectory() {
        lstOrganization = new ArrayList<>();
    }

    public ArrayList<Organization> getLstOrganisation() {
        return lstOrganization;
    }
    
    public Organization createOrganization(OrgType type,String name){
        Organization organization = null;
        if (type.getValue().equals(OrgType.Doctor.getValue())){
            organization = new DoctorOrganization(name);
          // organization=new ClinicOrganisation(name);
            lstOrganization.add(organization);
        }
        else if (type.getValue().equals(OrgType.Lab.getValue())){
            organization = new LabOrganization(name);           
         //   organization=new SupplierOrganisation(name);
            lstOrganization.add(organization);
        }
        else if(type.getValue().equals(OrgType.PoliceDepartment.getValue()))
        {
           organization = new PoliceDepartmentOrganization(name);           
         //   organization=new SupplierOrganisation(name);
            lstOrganization.add(organization); 
            
        }
        else if(type.getValue().equals(OrgType.FamilyCare.getValue()))
        {
           organization=new FamilyCareOrganization(name);
            lstOrganization.add(organization);
        }
        else if(type.getValue().equals(OrgType.SuicideAwarenessFoundation.getValue()))
        {
           organization=new SuicideAwarenessOrganization(name);
            lstOrganization.add(organization);
        }
        else if(type.getValue().equals(OrgType.ReceptionistOrganization.getValue()))
        {
           organization=new ReceptionistOrganization(name);
            lstOrganization.add(organization);
        }
        else if(type.getValue().equals(OrgType.EducationReception.getValue()))
        {
            organization=new RegistrationOrganization(name);
            lstOrganization.add(organization);
        }
         else if(type.getValue().equals(OrgType.AddictionRecoveryOrganization.getValue()))
        {
            organization=new AddictionRecoveryOrganization(name);
            lstOrganization.add(organization);
        }
          else if(type.getValue().equals(OrgType.CounsellerOrganization.getValue()))
        {
            organization=new CounsellorOrganization(name);
            lstOrganization.add(organization);
        }
          else if(type.getValue().equals(OrgType.InstituteRehabOrganization.getValue()))
        {
            organization=new InstituteRehabOrganization(name);
            lstOrganization.add(organization);
        }
          else if(type.getValue().equals(OrgType.CitizenCompliantOrganization.getValue()))
        {
            organization=new CitizenComplaintOrganization(name);
            lstOrganization.add(organization);
        }
        else
        {
            //#TODO other org
        }
        return organization;
    }
    public void removeOrganisation(Organization o)
    {
        lstOrganization.remove(o);
    }
}
