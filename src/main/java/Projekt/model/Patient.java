package Projekt.model;


public class Patient {
    public String name ;
    public String address ;
    public String cprNumber ;
    public Datacategory datacategory;
    public String medicalCenter ;
    public String hospital;
    public String sortDataCategory;

    public Patient(String name, String address, String cprNumber, Datacategory datacategory,
            String medicalCenter, String hospital, String sortDataCategory) {
        this.name = name;
        this.address = address;
        this.cprNumber = cprNumber;
        this.datacategory = datacategory;
        this.medicalCenter = medicalCenter;
        this.hospital = hospital;
        this.sortDataCategory = sortDataCategory;
    }

    public String getAddress() {
        return address;
    }
    public String getCprNumber() {
        return cprNumber;
    }
    public Datacategory getDatacategory() {
        return datacategory;
    }
    public String getHospital() {
        return hospital;
    }
    public String getMedicalCenter() {
        return medicalCenter;
    }
    public String getName() {
        return name;
    }
    public String getSortDataCategory() {
        return sortDataCategory;
    }
  



    
    
}
