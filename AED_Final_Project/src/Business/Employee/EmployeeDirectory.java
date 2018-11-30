/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Chaitanya
 */
public class EmployeeDirectory {
   private ArrayList<Employee> lstEmployee;

    public ArrayList<Employee> getLstEmployee() {
        return lstEmployee;
    }

    public void setLstEmployee(ArrayList<Employee> lstEmployee) {
        this.lstEmployee = lstEmployee;
    }

    public EmployeeDirectory() {
        lstEmployee=new ArrayList<>();
    }
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        lstEmployee.add(employee);
        return employee;
    }

   
     
}
