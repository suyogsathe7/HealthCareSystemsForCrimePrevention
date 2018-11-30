/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class PersonDirectory {
    private ArrayList<Person> lstPerson;
    public PersonDirectory()
    {
        lstPerson=new ArrayList<>();
    }

    public ArrayList<Person> getLstPerson() {
        return lstPerson;
    }

    public void setLstPerson(ArrayList<Person> lstPerson) {
        this.lstPerson = lstPerson;
    }
    public Person addPerson()
    {
        Person p=new Person();
        lstPerson.add(p);
        return p;
    }
    public void removePerson(Person p)
    {
        lstPerson.remove(p);
    }
    
    public boolean  isSSNnumberUnique(int ssn)
    {
       for(Person p : getLstPerson())
       {
           if(p.getSsnNumber()==ssn)
           { return false;
           }
           }
       return true;
       
       
    }
            
}
