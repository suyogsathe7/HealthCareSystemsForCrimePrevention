/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;


/**
 *
 * @author Chaitanya
 */
public class EcoSystem extends Organization{
   private static EcoSystem bObj;
 private NetworkDirectory networkDir;

    public NetworkDirectory getNetworkDir() {
        return networkDir;
    }

    public void setNetworkDir(NetworkDirectory networkDir) {
        this.networkDir = networkDir;
    }

 public static EcoSystem getBusiness()
 {
     if(bObj==null)
     {
         bObj=new EcoSystem();
     }
     return bObj;
 }
 private EcoSystem()
 {
    super(null);
    networkDir=new NetworkDirectory(); 
 }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles=new ArrayList<>();
    roles.add(new SystemAdminRole());
    return roles;
    }
    
    public boolean checkIfUserIdisUnq(String userid)
    {
       
        if(!this.getUserAccountDirectory().checkIfUserIdIsUnique(userid))
        {
            return false;
        }
        
        for(Network n:networkDir.getLstNetwork())
        {
            for(Enterprise erp:n.getEnterpriseDir().getLstEnterprises())
            {
             if(!erp.getUserAccountDirectory().checkIfUserIdIsUnique(userid))
             {
                 return false;
             }
             
             for(Organization o:erp.getOrdDir().getLstOrganisation())
             {
                 if(!o.getUserAccountDirectory().checkIfUserIdIsUnique(userid))
                 {
                     return false;
                 }
             }
             
            }
           //TODO complete code
        }
        return true;
    }
    
    public boolean checkIfEmployeeAlreadyPresent(Employee emp)
    {
        if(!this.getUserAccountDirectory().checkIfEmployeeHasAccount(emp))
        {
            return false;
        }
        
        for(Network n:networkDir.getLstNetwork())
        {
            for(Enterprise erp:n.getEnterpriseDir().getLstEnterprises())
            {
             if(!erp.getUserAccountDirectory().checkIfEmployeeHasAccount(emp))
             {
                 return false;
             }
             
             for(Organization o:erp.getOrdDir().getLstOrganisation())
             {
                 if(!o.getUserAccountDirectory().checkIfEmployeeHasAccount(emp))
                 {
                     return false;
                 }
             }
             
            }
          
        }
        return true;
    } 
}
