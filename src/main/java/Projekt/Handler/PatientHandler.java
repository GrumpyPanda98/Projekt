package Projekt.Handler;
import java.sql.ResultSet;
import java.sql.SQLException;
import Projekt.database.*;
import Projekt.model.*;

public class PatientHandler implements Queryable {

    public  static String tempName = "fejl"; // bruges til at tjekke om der reelt er hentet et navn. Ellers skrives nemlig Fejl.
    public  static String newCPR;
    public  static String newAddress;
  
    
    // overskriver kommandoen i interfacet. Denne metode bliver kun kaldt hvis returnSqlQuery kommandoen går igennem
    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        while(rs.next()){
            Patient aktuelPatient = new Patient(rs.getString("navn"), rs.getString("adresse"), rs.getString("CPR"));
            tempName = aktuelPatient.getName();
             newCPR = aktuelPatient.getCPR(); 
             newAddress = aktuelPatient.getAddress();
                       
        
        }
    }

    // kommandoen til SQL databasen
    @Override
    public String returnSqlQuery() {
     
       String sqlStatement = "SELECT * FROM `Patientinfo` WHERE `CPR` =" + Patient.getcprNumber();
        return sqlStatement;
    }

 }