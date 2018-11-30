/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugRecord;

import Business.Person.Person;

/**
 *
 * @author Suyog Sathe
 */
public class DrugRecord {
    
    private Signs signs;
    private PriorityLevel pl;
    private Person person;

    public DrugRecord()
    {
        signs=new Signs();
        person=new Person();
    }
       
 public enum PriorityLevel
    {
        High("High"),
        Medium("Medium"),
        Low("Low");
        
        
        private String type;
         PriorityLevel(String type)
        {
            this.type=type;
        }
        @Override
         public String toString()
         {
             return this.type;
         }
    } 
 
  public PriorityLevel getPl() {
        return pl;
    }

    public void setPl(PriorityLevel pl) {
        this.pl = pl;
    }

    public Signs getSigns() {
        return signs;
    }

    public void setSigns(Signs signs) {
        this.signs = signs;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
}
