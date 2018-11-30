/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

/**
 *
 * @author Chaitanya
 */
public class WorkResponse extends WorkRequest implements ISubrequest{
    private Object[] result;
    private WorkRequest[] workReqArray;
    public Object[] getResult() {
        return result;
    }

    public void setResult(Object[] result) {
        this.result = result;
    }
    
    public WorkResponse() {
      
       result=new Object[2];
       //result[0]=false;
    }
    
    @Override
    public WorkRequest[] CreateSubRequest(int x)
    {
        WorkRequest[] wrArr=new WorkRequest[x];
        for(int i=0;i<x;i++)
        {
            wrArr[i]=new WorkResponse();
        }
        this.workReqArray=wrArr;
        return wrArr;
    }

    public WorkRequest[] getWorkReqArray() {
        return workReqArray;
    }
}
