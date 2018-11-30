/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CriminalRecord;

/**
 *
 * @author Chaitanya
 */
public class Crime {
   private String crimeType ;
   private String criminalType;
   private String repeatingCrime;
   private int SeverityLevel;
   private CrimeType crimeTypeVal;

    public CrimeType getCrimeTypeVal() {
        return crimeTypeVal;
    }

    public void setCrimeTypeVal(CrimeType crimeTypeVal) {
        this.crimeTypeVal = crimeTypeVal;
    }
   public enum CrimeType
   {
       Suicide("Suicide"),
       SexualAssault("Sexual Assault"),
       Murder("Murder"),
       Extortion("Extortion"),
       Theft("Theft"),
       Kidnapping("Kidnapping");
       
       private String ct;
       CrimeType(String ct)
       {
           this.ct=ct;
       }
       @Override
       public String toString()
       {
           return this.ct;
       }
       
       
       
       
   }
        public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getCriminalType() {
        return criminalType;
    }

    public void setCriminalType(String criminalType) {
        this.criminalType = criminalType;
    }

    public String getRepeatingCrime() {
        return repeatingCrime;
    }

    public void setRepeatingCrime(String repeatingCrime) {
        this.repeatingCrime = repeatingCrime;
    }

    public int getSeverityLevel() {
        return SeverityLevel;
    }

    public void setSeverityLevel(int SeverityLevel) {
        this.SeverityLevel = SeverityLevel;
    }

    
   
    
    
}
