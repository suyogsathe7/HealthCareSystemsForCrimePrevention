/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CriminalRecord;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class CriminalRecord {
  private Person person;  
  private ArrayList<Crime> lstCrime;
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
  
    public CriminalRecord() {
        person=new Person();
        lstCrime=new ArrayList<>();
    }

    public ArrayList<Crime> getLstCrime() {
        return lstCrime;
    }

    public void setLstCrime(ArrayList<Crime> lstCrime) {
        this.lstCrime = lstCrime;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    public Crime addCrime()
    {
       Crime cm  = new Crime();
       lstCrime.add(cm);
       return cm;
    
    }
}
