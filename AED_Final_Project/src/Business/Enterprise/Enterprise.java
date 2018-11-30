/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Chaitanya
 */
public abstract class Enterprise extends Organization{
    private OrganizationDirectory ordDir;
    private ErpType et;

    public ErpType getEt() {
        return et;
    }

    public void setEt(ErpType et) {
        this.et = et;
    }
    public enum ErpType
    {
     Hospital("Hospital"){},
     Security("Security"){},
     Ngo("Ngo"){},
     EducationInstitute("Education Institute"){},
     SuicideAwareness("SuicideAwareness"){},
     DrugFree("Drug Free"){};
     private String val;
      ErpType(String nm)
     {
         this.val=nm;
     }

        public String getVal() {
            return val;
        }
    @Override    
    public String toString()
    {
        return val;
    }
    }
    
    public OrganizationDirectory getOrdDir() {
        return ordDir;
    }

    public Enterprise(String name,ErpType type) {
        super(name);
        this.et=type;
        ordDir=new OrganizationDirectory();
    }

    public void setOrdDir(OrganizationDirectory ordDir) {
        this.ordDir = ordDir;
        
    }
    
}
