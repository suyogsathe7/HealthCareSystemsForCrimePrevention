/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.DrugAbuseControl.DrugReport;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Suyog Sathe
 */
public class DrugFreeEnterprise extends Enterprise{
    private DrugReport drugRep;

    public DrugReport getDrugRep() {
        return drugRep;
    }

    public void setDrugRep(DrugReport drugRep) {
        this.drugRep = drugRep;
    }
    public DrugFreeEnterprise(String name) {
        super(name,Enterprise.ErpType.DrugFree);
        drugRep=new DrugReport();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
