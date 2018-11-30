/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class WorkQueue {
    private ArrayList<WorkRequest> lstWorkRequest;

    public WorkQueue() {
        lstWorkRequest=new ArrayList<>();
    }

    public ArrayList<WorkRequest> getLstWorkRequest() {
        return lstWorkRequest;
    }

    public void setLstWorkRequest(ArrayList<WorkRequest> lstWorkRequest) {
        this.lstWorkRequest = lstWorkRequest;
    }
    
}
