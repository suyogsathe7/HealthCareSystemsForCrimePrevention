/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.User.UserAccount;
import Interface.DoctorWorkArea.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(DoctorOrganization)organisation,etrp,business);
        
    }
    
}
