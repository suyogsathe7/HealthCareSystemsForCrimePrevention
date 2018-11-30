/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Chaitanya
 */
public class Network {
    private String cityName;
    private static int count=1;
    private int networkId;
    private EnterpriseDirectory enterpriseDir;

    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }

    public String getCityName() {
        return cityName;
    }

    
    

    public int getNetworkId() {
        return networkId;
    }


    public Network(String cityName) {
        this.cityName = cityName;
        networkId=count;
        count++;
        enterpriseDir=new EnterpriseDirectory();    
    }
    
    
    @Override
    public String toString()
    {
        return this.cityName;
    }
    
}
