/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Person.Person;
import Business.User.UserAccount;
import java.util.Date;

/**
 *
 * @author Chaitanya
 */
public class WorkRequest {
private static int count =0;
    private int requestId;
    private String status;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private Date responseDate;
    //private String diseaseName;
   // private String vaccineName;
    //private int quantityReq;
    private Person person;
    private boolean isComplete;
    private RequestType rtype;

    public RequestType getRtype() {
        return rtype;
    }

    public void setRtype(RequestType rtype) {
        this.rtype = rtype;
    }
    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    private SubRequestResults srs;

    public SubRequestResults getSrs() {
        return srs;
    }

    public void setSrs(SubRequestResults srs) {
        this.srs = srs;
    }
    private OperationalLevel ol; 
    
    public OperationalLevel getOl() {
        return ol;
    }

    public void setOl(OperationalLevel ol) {
        this.ol = ol;
    }
    public enum OperationalLevel
    {
        Doctor("Doctor"),
        Lab("Lab"),
        Hospital("Hospital"),
        SP("SP"),
        Security("Security"),
        SA("SA"),
        Education("Education"),
        Police("Police"),
        InstituteReception("Institute Reception"),
        InstituteRehab("InstituteRehab"),
        FamilyCare("FamilyCare"),
        DrugFree("Drug Free"),
        AddictionRecovery("Addiction Recovery"),
        CounsellingOrganization("Counselling Organization"),
        CitizenCompliant("CitizenCompliant");
        
        
        private String type;
         OperationalLevel(String type)
        {
            this.type=type;
        }
         
    }
    public enum SubRequestResults
    {
        Waiting("Waiting"),
        Complete("Complete");
        private String type;
        SubRequestResults(String type)
        {
            this.type=type;
        }
    }
    public enum RequestType
    {
        SuicidePrevention("Suicide Prevention"),
        DrugAbusePrevention("Drug Abuse Prevention"),
        CrimePrevention("Crime Prevention");
        private String reqType;
        RequestType(String type)
        {
         reqType=type;   
        }
        @Override
        public String toString()
        {
          return this.reqType;  
        }
    }

    public WorkRequest() {
        count++;
        requestId=count;
        person=new Person();
        requestDate=new Date();
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }
    @Override
    public String toString()
    {
        return String.valueOf(this.requestId);
    }   
}
