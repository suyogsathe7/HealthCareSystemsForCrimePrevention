/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SuicidePrevention;

import Business.Person.Person;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Chaitanya
 */
public class Report {
    private HashMap<Person,ArrayList<Event>>  tmSuicideReport;
    private ArrayList<String> lstAlerts;

    public ArrayList<String> getLstAlerts() {
        return lstAlerts;
    }

    public void setLstAlerts(ArrayList<String> lstAlerts) {
        this.lstAlerts = lstAlerts;
    }
    public HashMap<Person, ArrayList<Event>> getTmSuicideReport() {
        return tmSuicideReport;
    }

    public void setTmSuicideReport(HashMap<Person, ArrayList<Event>> tmSuicideReport) {
        this.tmSuicideReport = tmSuicideReport;
    }

    

    public Report() {
        tmSuicideReport=new HashMap<>();
        lstAlerts=new ArrayList<>();
    }
    public void createReport(Person p,ArrayList<Event> lstEvent)
    {
        tmSuicideReport.put(p, lstEvent);
        
    }
    public void removeReport(Person p)
    {
        tmSuicideReport.remove(p);
    }
    public ArrayList<Event> getEventList()
    {
        ArrayList<Event> lstEvents=new ArrayList<>();
        return lstEvents;
    }
}
