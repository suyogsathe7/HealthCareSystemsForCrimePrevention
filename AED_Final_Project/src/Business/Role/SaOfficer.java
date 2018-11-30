/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SuicideAwarenessOrganization;
import Business.User.UserAccount;
import Interface.SuicideAwarenessWorkArea.SuicideAwarenessWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chinmay
 */
public class SaOfficer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
       return new SuicideAwarenessWorkAreaJPanel(userProcessContainer,account,(SuicideAwarenessOrganization)organisation,etrp,business);
       //TODO;
    }
    
}
