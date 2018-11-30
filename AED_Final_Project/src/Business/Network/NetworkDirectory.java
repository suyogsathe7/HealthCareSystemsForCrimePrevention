/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class NetworkDirectory {
 private ArrayList<Network> lstNetwork;

    public ArrayList<Network> getLstNetwork() {
        return lstNetwork;
    }

    public void setLstNetwork(ArrayList<Network> lstNetwork) {
        this.lstNetwork = lstNetwork;
    }

    public NetworkDirectory() {
        lstNetwork=new ArrayList<>();
    }
    public Network addNetwork(String state)
    {
        Network n=new Network(state);
        lstNetwork.add(n);
        return n;
    }
    public void removeNetwork(Network n)
    {
        lstNetwork.remove(n);
    }   
}
