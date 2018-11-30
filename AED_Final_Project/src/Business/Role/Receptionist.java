/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.User.UserAccount;
import javax.swing.JPanel;
import Interface.Reception.ReceptionWorkAreaJPanel;

/**
 *
 * @author Suyog Sathe
 */
public class Receptionist extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        return new ReceptionWorkAreaJPanel(userProcessContainer,account,(ReceptionistOrganization)organisation,etrp,business);
    }
    
}
