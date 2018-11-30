/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.DrugFreeOrganization;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class EnterpriseDirectory {
   private ArrayList<Enterprise> lstEnterprises;
   public ArrayList<Enterprise> getLstEnterprises() {
        return lstEnterprises;
    }

    public void setLstEnterprises(ArrayList<Enterprise> lstEnterprises) {
        this.lstEnterprises = lstEnterprises;
    }
    public EnterpriseDirectory()
    {
        lstEnterprises=new ArrayList<>();;
    }
    public Enterprise addEnterprise(Enterprise.ErpType t,String name)
    {
        Enterprise e=null;
        if(t.getVal().equals(Enterprise.ErpType.Hospital.getVal()))
        {
          e=new HospitalEnterprise(name);
            lstEnterprises.add(e);
        }
        else if(t.getVal().equals(Enterprise.ErpType.Security.getVal()))
        {
             e=new SecurityEnterprise(name);
            lstEnterprises.add(e);
        }
        else if(t.getVal().equals(Enterprise.ErpType.SuicideAwareness.getVal()))
        {
            e=new SuicideAwarenessEnterprise(name);
            lstEnterprises.add(e);
        }
        else if(t.getVal().equals(Enterprise.ErpType.EducationInstitute.getVal()))
        {
            e=new EducationInstituteEnterprise(name);
            lstEnterprises.add(e);
            
        }
        else if(t.getVal().equals(Enterprise.ErpType.DrugFree.getVal()))
        {
            e=new DrugFreeEnterprise(name);
            lstEnterprises.add(e);
            
        }
        else
        {
            //TODO add one more elseif for your enterprise.
        }
        return e;
    }
    public void removeEnterprise(Enterprise e)
    {
        lstEnterprises.remove(e);
    } 
}
