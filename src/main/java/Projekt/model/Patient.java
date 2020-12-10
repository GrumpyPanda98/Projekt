package Projekt.model;
import Projekt.Handler.*;
import Projekt.database.DatabaseManipulator;

public class Patient {
    private String name;
    private String address;
    private static String cprNumber;
    private Datacategory datacategory;
    private String medicalCenter;
    private String hospital;
    private String sortDataCategory;
    private String CPR;

    private static String cpr;

    public Patient(String name, String address, String cprNumber, Datacategory datacategory, String medicalCenter,
            String hospital, String sortDataCategory) {
        this.name = name;
        this.address = address;
        Patient.cprNumber = cprNumber;
        this.datacategory = datacategory;
        this.medicalCenter = medicalCenter;
        this.hospital = hospital;
        this.sortDataCategory = sortDataCategory;
    }
    public Patient(String name, String address, String CPR) {
        this.name = name;
        this.address = address;
        this.CPR = CPR;
    }

    public String getAddress() {
        return address;
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

    public static String getcprNumber() {
        return cpr;
    }
    public String getCPR() {
        return cpr;
    }
    
    public static void setCprNumber(String cprNumber){
        cpr = cprNumber;
    }
    public static void getHealthCaredata(String cprNumber){              // Opretter PersonHandler og henter sundhedsdata
        PatientHandler ph = new PatientHandler();             
        DatabaseManipulator.executeQueryWithResultSet(ph);
    }
   
    public Patient(String name){
    
        this.name = name;
    }


    
    
}
