/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public abstract class Role {
   public enum RoleType{
        SystemAdmin("System Admin"),
        Admin("Admin"),         
        Doctor("Doctor"),
        PoliceOfficer("PoliceOfficer"),
        SocialWorker("Social Worker"),
        Counseller("Counseller"),
        SaOfficer("Suicide Awareness Officer"),
        Receptionist("Receptionist"),
        EducationOperator("Education Reception"),
        Advisor("Advisor");

        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation,Enterprise etrp, EcoSystem business);
   // public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business); 
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
  
}
