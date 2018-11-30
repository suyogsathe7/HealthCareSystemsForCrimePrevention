/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.User.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public abstract class Organization {

    private String name;
    private String orgType;

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }
    private WorkQueue workQueue;
    private EmployeeDirectory staffDirectory;

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum OrgType {
        Admin("Admin Organization") {

        }, Doctor("Doctor Organization") {
        }, Lab("Lab Organization") {
        }, SuicideAwarenessFoundation("SuicideAwareness Organization") {
        }, PoliceDepartment("PoliceDepartment Organization") {
        },FamilyCare("FamilyCare Organization"){
        }, DrugFreeOrganization("DrugFree Organization"){
        },ReceptionistOrganization("Receptionist Organization"){
        },EducationReception("Education Reception organization"){
        },CounsellerOrganization("Counseller Organization"){
        },AddictionRecoveryOrganization("Addiction Recovery Organization"),
        InstituteRehabOrganization("Rehab Organization for an Institution"){
        },CitizenCompliantOrganization("Citizen Compliant Organization"){};
        


        private String value;

        private OrgType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        staffDirectory = new EmployeeDirectory();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization(String name, String orgName) {
        this(name);
        //this.name = orgName;
        this.orgType = name;
//        workQueue = new WorkQueue();
//        staffDirectory = new EmployeeDirectory();
//        personDirectory = new PersonDirectory();
//        userAccountDirectory = new UserAccountDirectory();
//        organizationID = counter;
//        ++counter;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
