/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class UserAccountDirectory {
   private ArrayList<UserAccount> lstUsers;

    public UserAccountDirectory() {
        lstUsers = new ArrayList<>();
    }

    public ArrayList<UserAccount> getLstUsers() {
        return lstUsers;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : lstUsers)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    public boolean checkIfUserIdIsUnique(String sg)
    {
        for(UserAccount ua:lstUsers)
        {
            if(ua.getUsername().equalsIgnoreCase(sg))
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkIfEmployeeHasAccount(Employee emp)
    {
        for(UserAccount ua:lstUsers)
        {
            if(ua.getEmployee()==emp)
            {
                return false;
            }
        }
        return true;
    }
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        lstUsers.add(userAccount);
        return userAccount;
    }  
}
