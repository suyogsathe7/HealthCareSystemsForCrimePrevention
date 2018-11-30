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
import Interface.PoliceWorkArea.PoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Tari
 */
public class PoliceOfficer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
       return new PoliceWorkAreaJPanel(userProcessContainer,account,organisation,etrp,business);
    }
    
}
