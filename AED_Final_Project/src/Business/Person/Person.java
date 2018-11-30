/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.CriminalRecord.CriminalRecord;
import Business.MedicalRecord.MedicalRecord;
import java.util.Date;

/**
 *
 * @author Chaitanya
 */
public class Person {
    private String personName;
    private Date dateOfBirth;

    private String email;
    private long phoneNo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    private int ssnNumber;

    //private MedicalRecord medicalRecord;
    //private CriminalRecord criminalRecord;
    private boolean available;
    private int itr;

    public int getItr() {
        return itr;
    }

    public void setItr(int itr) {
        this.itr = itr;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    private int age;
    private boolean preliminaryCheck;
    private boolean InterrogateCheck;
    private String orgTravere;
//    public MedicalRecord getMedicalRecord() {
//        return medicalRecord;
//    }
//
//    public void setMedicalRecord(MedicalRecord medicalRecord) {
//        this.medicalRecord = medicalRecord;
//    }
//
//    public CriminalRecord getCriminalRecord() {
//        return criminalRecord;
//    }
//
//    public void setCriminalRecord(CriminalRecord criminalRecord) {
//        this.criminalRecord = criminalRecord;
//    }

    public String getOrgTravere() {
        return orgTravere;
    }

    public void setOrgTravere(String orgTravere) {
        this.orgTravere = orgTravere;
    }

   

    public boolean getPreliminaryCheck() {
        return preliminaryCheck;
    }

    public void setPreliminaryCheck(boolean preliminaryCheck) {
        this.preliminaryCheck = preliminaryCheck;
    }

    public boolean isInterrogateCheck() {
        return InterrogateCheck;
    }

    public void setInterrogateCheck(boolean InterrogateCheck) {
        this.InterrogateCheck = InterrogateCheck;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person() {
        //medicalRecord=new MedicalRecord();
        //criminalRecord=new CriminalRecord();
        this.available=true;
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(int ssnNumber) {
        this.ssnNumber = ssnNumber;
    }
    
    private String city;
    private String state;
    private String country;
    private String street;
    private String profilePhoto;

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    private String nationality;
    private String address;
    private Gender gender;
    public enum Gender
    {
        Male("Male"){},
        Female("Female"){};
        private String value;
     Gender(String g)
     {
      this.value=g;   
     }

        public String getValue() {
            return value;
        }
        @Override
     public String toString()
     {
         return this.value;
     }
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
    
}
