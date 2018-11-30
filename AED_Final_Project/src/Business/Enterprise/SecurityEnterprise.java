/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CriminalRecord.CriminalRecordDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class SecurityEnterprise extends Enterprise{

    private CriminalRecordDirectory criminalRecDir;

    public CriminalRecordDirectory getCriminalRecDir() {
        return criminalRecDir;
    }

    public void setCriminalRecDir(CriminalRecordDirectory criminalRecDir) {
        this.criminalRecDir = criminalRecDir;
    }
    
    public SecurityEnterprise(String name) {
         super(name,Enterprise.ErpType.Security);
         criminalRecDir=new CriminalRecordDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
    
}
