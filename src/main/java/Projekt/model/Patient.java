package Projekt.model;


public class Patient {
    public String name ;
    public String address ;
    private String cprNumber ;
    private Datacategory datacategory;
    private String medicalCenter ;
    private String hospital;
    private String sortDataCategory;

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

    
  



    
    
}
