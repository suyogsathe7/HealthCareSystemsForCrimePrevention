/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.SexualAssault.AssaultDirectory;
import java.util.ArrayList;

/**
 *
 * @author Tari
 */
public class EducationInstituteEnterprise extends Enterprise{
    private AssaultDirectory assualtDir;
    public EducationInstituteEnterprise(String name) {
        super(name,Enterprise.ErpType.EducationInstitute);
       assualtDir=new AssaultDirectory();
    }

    public AssaultDirectory getAssualtDir() {
        return assualtDir;
    }

    public void setAssualtDir(AssaultDirectory assualtDir) {
        this.assualtDir = assualtDir;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }   
}
