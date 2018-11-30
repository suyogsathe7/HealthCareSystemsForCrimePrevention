/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SuicidePrevention;

/**
 *
 * @author Chaitanya
 */
public class Event {
     private static int counter=0;
     private int eventId;
    // private int iteration;

    
     private SuicideEvaluation seObj;

    public SuicideEvaluation getSeObj() {
        return seObj;
    }

    public void setSeObj(SuicideEvaluation seObj) {
        this.seObj = seObj;
    }
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Event() {
        counter++;
        eventId=counter;
        seObj=new SuicideEvaluation();
    }
     @Override
     public String toString()
     {
         return String.valueOf(this.eventId);
     }

   
    
    
    

    
}
