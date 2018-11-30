/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegistrationOrganization;
import Business.User.UserAccount;
import Interface.EducationReception.EducationReceptionWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chinmay
 */
public class EducationOperator extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,  Organization organisation, Enterprise etrp, EcoSystem business) {
        return new EducationReceptionWorkAreaPanel(userProcessContainer,account,(RegistrationOrganization)organisation,etrp,business);
    }
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

