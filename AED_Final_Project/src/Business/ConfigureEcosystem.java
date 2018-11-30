/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CriminalRecord.Crime;
import Business.CriminalRecord.CriminalRecord;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SecurityEnterprise;
import Business.Enterprise.SuicideAwarenessEnterprise;
import Business.Network.Network;
import Business.Organization.AddictionRecoveryOrganization;
import Business.Organization.CitizenComplaintOrganization;
import Business.Organization.CounsellorOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.FamilyCareOrganization;
import Business.Organization.InstituteRehabOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceDepartmentOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.RegistrationOrganization;
import Business.Organization.SuicideAwarenessOrganization;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.Role.Advisor;
import Business.Role.Counsellor;
import Business.Role.DoctorRole;
import Business.Role.EducationOperator;
import Business.Role.InstituteRehabOfficer;
import Business.Role.NurseRole;
import Business.Role.PoliceOfficer;
import Business.Role.Proctor;
import Business.Role.Receptionist;
import Business.Role.SaOfficer;
import Business.Role.SocialWorker;
import Business.Role.SystemAdminRole;
import Business.SuicidePrevention.Event;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chaitanya
 */
public class ConfigureEcosystem {

    public static EcoSystem initializeEcoSystem() {

        EcoSystem b = EcoSystem.getBusiness();
        Employee employee = b.getStaffDirectory().createEmployee("Xavier");
        b.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        Network n = b.getNetworkDir().addNetwork("Boston");
        Network n5=b.getNetworkDir().addNetwork("New York");

        for (Network n1 : b.getNetworkDir().getLstNetwork()) {
            if(n1.getCityName().equalsIgnoreCase("Boston"))
            {
            n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.Hospital, "Boston Hospital");
            n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.Security, "BPD");
            n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.SuicideAwareness, "Afsp ngo");
            n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.EducationInstitute, "Neu");
            n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.DrugFree, "Drug free enterprise");
            }
            else if(n1.getCityName().equalsIgnoreCase("New York"))
            {
             n1.getEnterpriseDir().addEnterprise(Enterprise.ErpType.Security, "New york police department");
            }
        }
        Enterprise securityNy=null;
        Enterprise cdc = null;
        Enterprise sd = null;
        Enterprise sp = null;
        Enterprise ed = null;
        Enterprise df = null;
        for (Network n2 : b.getNetworkDir().getLstNetwork()) {
            if(n2.getCityName().equals("Boston"))
            {
            for (Enterprise e : n2.getEnterpriseDir().getLstEnterprises()) {
                if (e.getEt().equals(Enterprise.ErpType.Hospital)) {
                    cdc = e;
                    Employee eg = e.getStaffDirectory().createEmployee("John doe");
                    e.getUserAccountDirectory().createUserAccount("john", "john", eg, new AdminRole());
                } else if (e.getEt().equals(Enterprise.ErpType.Security)) {
                    sd = e;
                    Employee eg = e.getStaffDirectory().createEmployee("Ann wells");
                    e.getUserAccountDirectory().createUserAccount("ann", "ann", eg, new AdminRole());
                } else if (e.getEt().equals(Enterprise.ErpType.SuicideAwareness)) {
                    sp = e;
                    Employee eg = e.getStaffDirectory().createEmployee("Mayur");
                    e.getUserAccountDirectory().createUserAccount("mayur", "mayur", eg, new AdminRole());
                } else if (e.getEt().equals(Enterprise.ErpType.EducationInstitute)) {
                    ed = e;
                    Employee eg = e.getStaffDirectory().createEmployee("Bounty");
                    e.getUserAccountDirectory().createUserAccount("bounty", "bounty", eg, new AdminRole());
                } else if (e.getEt().equals(Enterprise.ErpType.DrugFree)) {
                    df = e;
                    Employee eg = e.getStaffDirectory().createEmployee("bread");
                    e.getUserAccountDirectory().createUserAccount("bread", "bread", eg, new AdminRole());
                }
            }
            }
            else if(n2.getCityName().equalsIgnoreCase("New York"))
            {
             for(Enterprise e2:n2.getEnterpriseDir().getLstEnterprises())
             {
                 securityNy=e2;
                 Employee eg=e2.getStaffDirectory().createEmployee("Rahul");
                 e2.getUserAccountDirectory().createUserAccount("rahul", "rahul", eg,new AdminRole());
             }
            }
        }
        //---------------for new york
        CitizenComplaintOrganization czny=(CitizenComplaintOrganization) securityNy.getOrdDir().createOrganization(Organization.OrgType.CitizenCompliantOrganization,"NY Citizen compliant department");
        Employee eny=czny.getStaffDirectory().createEmployee("Rohit");
        czny.getUserAccountDirectory().createUserAccount("rohit", "rohit",eny,new Proctor());

//------------------for boston
        DoctorOrganization doc = (DoctorOrganization) cdc.getOrdDir().createOrganization(Organization.OrgType.Doctor, "Apollo Hospital");
        LabOrganization lab = (LabOrganization) cdc.getOrdDir().createOrganization(Organization.OrgType.Lab, "Star labs");
        ReceptionistOrganization ro = (ReceptionistOrganization) cdc.getOrdDir().createOrganization(Organization.OrgType.ReceptionistOrganization, "ABC");
        FamilyCareOrganization fco = (FamilyCareOrganization) sp.getOrdDir().createOrganization(Organization.OrgType.FamilyCare, "Family Care");
        SuicideAwarenessOrganization swa = (SuicideAwarenessOrganization) sp.getOrdDir().createOrganization(Organization.OrgType.SuicideAwarenessFoundation, "American foundation for suicide prevention");
        RegistrationOrganization regOrg = (RegistrationOrganization) ed.getOrdDir().createOrganization(Organization.OrgType.EducationReception, "Boston university");
        InstituteRehabOrganization insOrg=(InstituteRehabOrganization) ed.getOrdDir().createOrganization(Organization.OrgType.InstituteRehabOrganization,"Boston rehabilitation centre");
        PoliceDepartmentOrganization polOrg = (PoliceDepartmentOrganization) sd.getOrdDir().createOrganization(Organization.OrgType.PoliceDepartment, "Boston PD");
        AddictionRecoveryOrganization aro = (AddictionRecoveryOrganization) df.getOrdDir().createOrganization(Organization.OrgType.AddictionRecoveryOrganization, "Be free");
        CounsellorOrganization co = (CounsellorOrganization) df.getOrdDir().createOrganization(Organization.OrgType.CounsellerOrganization, "BE counselled");
        CitizenComplaintOrganization czo=(CitizenComplaintOrganization) sd.getOrdDir().createOrganization(Organization.OrgType.CitizenCompliantOrganization,"Boston Citizen compliant department");
// SupplierOrganisation sup=(SupplierOrganisation) sd.getOrdDir().createOrganization(Organisation.orgType.Supplier,"Fizer");

        Employee emp3 = doc.getStaffDirectory().createEmployee("rohan");
        doc.getUserAccountDirectory().createUserAccount("rohan", "rohan", emp3, new DoctorRole());

        Employee emp4 = lab.getStaffDirectory().createEmployee("suyog");
        lab.getUserAccountDirectory().createUserAccount("suyog", "suyog", emp4, new NurseRole());

        Employee emp5 = ro.getStaffDirectory().createEmployee("chai");
        ro.getUserAccountDirectory().createUserAccount("chai", "chai", emp5, new Receptionist());

        Employee emp6 = fco.getStaffDirectory().createEmployee("Ankur");
        fco.getUserAccountDirectory().createUserAccount("ankur", "ankur", emp6, new SocialWorker());

        Employee emp7 = swa.getStaffDirectory().createEmployee("Yash");
        swa.getUserAccountDirectory().createUserAccount("yash", "yash", emp7, new SaOfficer());

        Employee emp8 = regOrg.getStaffDirectory().createEmployee("Kavla");
        regOrg.getUserAccountDirectory().createUserAccount("kavla", "kavla", emp8, new EducationOperator());

        Employee emp9 = polOrg.getStaffDirectory().createEmployee("Chinmay");
        polOrg.getUserAccountDirectory().createUserAccount("chin", "chin", emp9, new PoliceOfficer());

        Employee emp10 = aro.getStaffDirectory().createEmployee("chaitanya");
        aro.getUserAccountDirectory().createUserAccount("chaitanya", "chaitanya", emp10, new Advisor());

        Employee emp11 = co.getStaffDirectory().createEmployee("priyesh");
        co.getUserAccountDirectory().createUserAccount("priyesh", "priyesh", emp11, new Counsellor());

        Employee emp12 = insOrg.getStaffDirectory().createEmployee("rm");
        insOrg.getUserAccountDirectory().createUserAccount("rm", "rm", emp12, new InstituteRehabOfficer());
        
        Employee emp13 = czo.getStaffDirectory().createEmployee("pratik");
        czo.getUserAccountDirectory().createUserAccount("pratik", "pratik", emp13, new Proctor());
        
       // Person per=polOrg.getPersonDirectory().addPerson();
       // per.setPersonName("sbcd");
       // per.set
       // CriminalRecord cr=polOrg.getCriminalRecDir().addCriminalRecord();
      //  cr.setPerson(per);
        //add crime details;
        Person per=regOrg.getPersonDirectory().addPerson();
        per.setPersonName("Prashant");
        per.setSsnNumber(13225);
        
        Person per1=regOrg.getPersonDirectory().addPerson();
        per1.setPersonName("Kartik");
        per1.setSsnNumber(12345);
        
        Person peSui=czo.getPersonDirectory().addPerson();
        peSui.setPersonName("Smith");
        peSui.setSsnNumber(687198);
        SecurityEnterprise secEnt=(SecurityEnterprise) sd;
        CriminalRecord cr1=secEnt.getCriminalRecDir().addCriminalRecord();
        cr1.setPerson(peSui);
        Crime c2=cr1.addCrime();
        c2.setCrimeType("Suicide");
        c2.setSeverityLevel(3);
        
        SuicideAwarenessEnterprise suiEnt=(SuicideAwarenessEnterprise) sp;
        
        eventGenerator(suiEnt);
        
        return b;
        
        
        
                
    }
    
    public static void eventGenerator(SuicideAwarenessEnterprise sae)
    {
        Person pt=new Person();
        pt.setPersonName("Test");
        pt.setGender(Person.Gender.Male);
        Event er=new Event();
        er.getSeObj().setEnvironmentalFactors(20);
        er.getSeObj().setVitalSignsFactor(8);
        er.getSeObj().setHistoricalFactors(18);
        er.getSeObj().setExternalFactors(5);
        er.getSeObj().setHealthFactors(16);
        er.getSeObj().CalculateSuicideThreatIndex();
        
        Event er1=new Event();
        er1.getSeObj().setEnvironmentalFactors(23);
        er1.getSeObj().setVitalSignsFactor(6);
        er1.getSeObj().setHistoricalFactors(16);
        er1.getSeObj().setExternalFactors(6);
        er1.getSeObj().setHealthFactors(20);
        er1.getSeObj().CalculateSuicideThreatIndex();
        
        ArrayList<Event> lstEve=sae.getReport().getEventList();
        lstEve.add(er);
        lstEve.add(er1);
//--start
        Event eventPrev=null;
        Event eventNext=er1;
        for(int i =0;i<lstEve.size();i++)
        {
            if(lstEve.get(i)==eventNext)
            {
                eventPrev=lstEve.get(i-1); 
                if(eventPrev!=null)
                {
                if(eventNext.getSeObj().getSuicideThreatIndex()>eventPrev.getSeObj().getSuicideThreatIndex())
                {
                    //do something;
                   // JOptionPane.showMessageDialog(null,"Alert sent");
                    int diff=eventNext.getSeObj().getSuicideThreatIndex()-eventPrev.getSeObj().getSuicideThreatIndex();
                    sae.getReport().getLstAlerts().add("Suicide threat index increased by"+diff+" person "+pt.getPersonName());
                }
                }
            }
        }
        //end
        sae.getReport().createReport(pt, lstEve);
    }
    
    
}
