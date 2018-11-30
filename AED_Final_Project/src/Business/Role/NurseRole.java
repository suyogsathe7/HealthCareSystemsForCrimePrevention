/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Interface.LabWorkArea.LabWorkAreaJPanel;
import Business.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public class NurseRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        return new LabWorkAreaJPanel(userProcessContainer,account,(LabOrganization)organisation,etrp,business);
    }
    
}
