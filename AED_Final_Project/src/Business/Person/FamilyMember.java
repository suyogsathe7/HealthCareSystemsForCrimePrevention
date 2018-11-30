/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Chaitanya
 */
public class FamilyMember extends Person{
    public enum Relationship
    {

        Father("Father"),
        Mother("Mother"),
        Sibling("Sibling"),
        Other("Other");
        private String r;
        private Relationship(String rs) {
        this.r=rs;
        }
        @Override
        public String toString()
        {
            return this.r;
        }
    }
    private Relationship rlp;

    public Relationship getRlp() {
        return rlp;
    }

    public void setRlp(Relationship rlp) {
        this.rlp = rlp;
    }
    public FamilyMember()
    {
        patient=new Person();
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNoOffm() {
        return noOffm;
    }

    public void setNoOffm(int noOffm) {
        this.noOffm = noOffm;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(int apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    private Person patient;
    private String fmName;

    public String getFmName() {
        return fmName;
    }

    public void setFmName(String fmName) {
        this.fmName = fmName;
    }
    private int ssn;
    private int noOffm;
    private String street;
    private int apartmentNo;
    private String city;
    private String State;
    private int zip;
}
