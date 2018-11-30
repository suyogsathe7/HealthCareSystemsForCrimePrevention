/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugAbuseControl;

import Business.Person.Person;

/**
 *
 * @author Suyog Sathe
 */
public class DrugEvaluation {
    private Person p;
    private int a;
    private int b;
    private int c;
    private int d;
    private int total;
    
    public DrugEvaluation()
    {
        p = new Person();
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void calculateTotal()
    {
        this.total=a+b+c+d;
    }
    
    
    
}
