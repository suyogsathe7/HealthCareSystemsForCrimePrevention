/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SexualAssault;

/**
 *
 * @author Chinmay
 */
public class Event {
    private SexualAssualtEval sexAssaultObj;
    private int eventId;
    private int counter=0;
     public Event() {
        
        sexAssaultObj =new SexualAssualtEval();
        counter++;
        eventId=counter;
    }
     
    
    public SexualAssualtEval getSexAssaultObj() {
        return sexAssaultObj;
    }

    public void setSexAssaultObj(SexualAssualtEval sexAssaultObj) {
        this.sexAssaultObj = sexAssaultObj;
    }
    
    public String toString()
    {
        return String.valueOf(this.eventId);
    }
    
}
