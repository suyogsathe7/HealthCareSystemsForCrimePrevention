/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenComplaintOrganization;
import Business.Organization.Organization;
import Business.User.UserAccount;
import Interface.ProctorWorkArea.ProctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public class Proctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
       return new ProctorWorkAreaJPanel(userProcessContainer,account,(CitizenComplaintOrganization)organisation,etrp,business);
    }
    
}
