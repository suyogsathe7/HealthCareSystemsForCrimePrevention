/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LabWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.User.UserAccount;
import Business.WorkRequest.WorkRequest;
import Business.WorkRequest.WorkResponse;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chaitanya
 */
public class ManageWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private LabOrganization organization;
    private Enterprise etrp;
    private EcoSystem business;

    public ManageWorkRequestJPanel(JPanel userProcessContainer, UserAccount account,LabOrganization organisation, Enterprise etrp, EcoSystem business) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.account=account;
       this.organization=organisation;
       this.etrp=etrp;
       this.business=business;
       populateWorkRequest();
    }
    public void populateWorkRequest()
    {
        DefaultTableModel dtm=(DefaultTableModel) tblWorkRequest.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:organization.getWorkQueue().getLstWorkRequest())
        {
            Object[] row=new Object[4];
            row[0]=wr;
            row[1]=wr.getPerson();
            row[2]=wr.getStatus();
            row[3]=wr.getReceiver()==null?"Unassigned":wr.getReceiver();

            dtm.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkRequestId", "Person", "Status", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(tblWorkRequest);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Work Request - LAB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnBack)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAssign)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(btnProcess)))))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnProcess)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(170, 170, 170))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkRequest.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkRequest wr=(WorkRequest) tblWorkRequest.getValueAt(selectedRow,0);
            if(!wr.getOl().equals(WorkRequest.OperationalLevel.Lab))
            {
             JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);       
             return;
            }
            if(wr.getReceiver()!=null && wr.getReceiver()!=account)
            {
               JOptionPane.showMessageDialog(null,"Request is assigned to some other user","WARNING",JOptionPane.WARNING_MESSAGE);    
                return;  
            }
            if(wr.getReceiver()==account)
            {
                
            JOptionPane.showMessageDialog(null,"Request already assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);    
            return;
            }
            
              wr.setReceiver(account);
             // wr.setOl(WorkRequest.OperationalLevel.Lab);
              JOptionPane.showMessageDialog(null,"Request id - "+wr.getRequestId()+" has been assigned to you!");
              populateWorkRequest();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a request from table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkRequest.getSelectedRow();
        if(selectedRow>-1)
        {
            
         WorkResponse wr=(WorkResponse) tblWorkRequest.getValueAt(selectedRow,0);
         if(wr!=null)
         {
         if(!wr.getOl().equals(WorkRequest.OperationalLevel.Lab))
            {
             JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);       
             return;
            }
            if(wr.getReceiver()!=account)
            { 
            JOptionPane.showMessageDialog(null,"Request is not assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);    
            return;
            } 
            if(wr.getRtype().equals(WorkResponse.RequestType.SuicidePrevention))
            {
            userProcessContainer.add("MonitorPatientVitalSignJPanel",new MonitorPatientVitalSignJPanel(userProcessContainer,wr,account,organization,etrp,business));
            ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
            }
            else if(wr.getRtype().equals(WorkResponse.RequestType.DrugAbusePrevention))
            {
                userProcessContainer.add("MonitorDrugSignsJPanel",new MonitorDrugSignsJPanel(userProcessContainer,wr,account,organization,etrp,business));
            ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
            }
//             Enterprise NgoEnterprise=null;
//          for(Network net :system.getNetworkDir().getLstNetwork())
//          {
//              for(Enterprise etr:net.getEnterpriseDir().getLstEnterprises())
//              {
//                  if(etr.getEt().equals(Enterprise.ErpType.Ngo))
//                  {
//                      NgoEnterprise=etr;
//                      break;
//                  }
//              }
//              if(NgoEnterprise!=null)
//              {
//                  break;
//              }
//          }
//          if(NgoEnterprise!=null)
//          
//          {
//               wr.setReceiver(null);
//              wr.setOl(WorkRequest.OperationalLevel.Ngo);
//              wr.setStatus("Pending-Request sent to Ngo");
//              ua.getWorkQueue().getLstWorkRequest().add(wr);
//              NgoEnterprise.getWorkQueue().getLstWorkRequest().add(wr);
//              JOptionPane.showMessageDialog(null,"Request sent to Ngo");
//              populateWorkRequest();
//          }
          
          //selection check
        }
            
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Please select a row from table","WARNING",JOptionPane.WARNING_MESSAGE);   
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
