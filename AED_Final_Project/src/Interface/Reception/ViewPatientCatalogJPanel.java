/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Reception;

import Business.DrugAbuseControl.DrugEvaluation;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.SuicidePrevention.Event;
import Business.User.UserAccount;
import Business.WorkRequest.WorkRequest;
import Business.WorkRequest.WorkResponse;
import Interface.LabWorkArea.MonitorPatientVitalSignJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suyog Sathe
 */
public class ViewPatientCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientCatalogJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organisation;
    private Enterprise etrp;
    private EcoSystem business;

    ViewPatientCatalogJPanel(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organisation = organisation;
        this.etrp = etrp;
        this.business = business;
        populatePatientDetails();
    }

    public void populatePatientDetails() {
        DefaultTableModel dtm = (DefaultTableModel) patientTable.getModel();
        dtm.setRowCount(0);
        for (Person p : organisation.getPersonDirectory().getLstPerson()) {
            Object[] row = new Object[4];
            row[0] = p;
            row[1] = p.getGender().getValue();
            row[2] = p.getPreliminaryCheck();
            row[3] = p.getOrgTravere();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        SendBtn = new javax.swing.JButton();
        removePatientBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Patients");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Gender", "Preliminary Check?", "Organization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setResizable(false);
            patientTable.getColumnModel().getColumn(1).setResizable(false);
            patientTable.getColumnModel().getColumn(2).setResizable(false);
            patientTable.getColumnModel().getColumn(3).setResizable(false);
        }

        SendBtn.setBackground(new java.awt.Color(255, 51, 51));
        SendBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        SendBtn.setText("Send to LAB");
        SendBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBtnActionPerformed(evt);
            }
        });

        removePatientBtn.setBackground(new java.awt.Color(255, 51, 51));
        removePatientBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        removePatientBtn.setText("Remove Patient");
        removePatientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePatientBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 51, 51));
        backBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removePatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(SendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removePatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void removePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePatientBtnActionPerformed
        int selectedRow = patientTable.getSelectedRow();
        
        //#TODO Logic to prevent deletion of patient from catalog 
        if (selectedRow > -1) {
            Person p = (Person) patientTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: account.getWorkQueue().getLstWorkRequest())
                {
                    if(wr.getPerson()==p && wr.isIsComplete()==false)
                    {
                        JOptionPane.showMessageDialog(null,"The work request for this patient is not yet complete","WARNING",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    
                }
            int op = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this patient?");
            if (op == 0) {
                organisation.getPersonDirectory().removePerson(p);
                JOptionPane.showMessageDialog(null, "Patient Removed successfully");
            } else {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a patient from table", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removePatientBtnActionPerformed

    private void SendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBtnActionPerformed
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow > -1) {
            Person p = (Person) patientTable.getValueAt(selectedRow, 0);
            if (p != null) {
                
                if(!p.isAvailable())
                {
                   JOptionPane.showMessageDialog(null,"This person is part of Work request, Please wait until request is completed","WARNING",JOptionPane.WARNING_MESSAGE);
                   return; 
                }
//                for(WorkRequest wr: account.getWorkQueue().getLstWorkRequest())
//                {
//                    if(wr.getPerson()==p)
//                    {
//                        JOptionPane.showMessageDialog(null,"Work request is already created for this patient","WARNING",JOptionPane.WARNING_MESSAGE);
//                        return;
//                    }
//                    
//                }
                Event event=null;
                DrugEvaluation de = null;
                WorkResponse workRequest = new WorkResponse();
                LabOrganization labOrg = null;
                workRequest.setSender(account);
                workRequest.setPerson(p);
                int count =p.getItr();
                count++;
                p.setItr(count);
                
                //event.setIteration(1);
                p.setAvailable(false);
                if(p.getOrgTravere().equalsIgnoreCase("Drug"))
                    
                {
                    de = new DrugEvaluation();
                    workRequest.getResult()[0]=de;
                    workRequest.setRtype(WorkRequest.RequestType.DrugAbusePrevention);
                }
                else 
                {
                    event=new Event();
                    workRequest.getResult()[0]=event;
                     workRequest.setRtype(WorkRequest.RequestType.SuicidePrevention);
                     
                }
                //TODO set reqtype here whether for drug prevention or suicide.
                account.getWorkQueue().getLstWorkRequest().add(workRequest);
                workRequest.setOl(WorkResponse.OperationalLevel.Lab);     //Todo change operational level
                // if (count >= 3) {
//                    etrp.getWorkQueue().getLstWorkRequest().add(workRequest);
//                    workRequest.setOl(WorkResponse.OperationalLevel.Hospital);
//                    workRequest.setStatus("Pending - Sent to L Admin");
//                    JOptionPane.showMessageDialog(null, "This patient needs to be further evaluated,Request sent to Hospital Enterprise");

              //  }
           // else {
                    for (Organization org : etrp.getOrdDir().getLstOrganisation()) {
                        if (org instanceof LabOrganization) {
                            labOrg = (LabOrganization) org;
                        }
                    }
                    labOrg.getWorkQueue().getLstWorkRequest().add(workRequest);
                    labOrg.getPersonDirectory().getLstPerson().add(p);
                    workRequest.setOl(WorkResponse.OperationalLevel.Lab);
                    workRequest.setStatus("Pending - Sent to Lab Organization");
                    JOptionPane.showMessageDialog(null, "This patient is sent to Lab");
              //  }
//            userProcessContainer.add("MonitorPatientVitalSignJPanel",new MonitorPatientVitalSignJPanel(userProcessContainer,p,account,organisation,etrp,business));
//            ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a patient from table", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SendBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton removePatientBtn;
    // End of variables declaration//GEN-END:variables
}
