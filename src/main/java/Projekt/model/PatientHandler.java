package Projekt.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import Projekt.database.*;

public class PatientHandler implements Queryable {

    // overskriver kommandoen i interfacet. Denne metode bliver kun kaldt hvis returnSqlQuery kommandoen går igennem
    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
           while(rs.next()){
            Patient patientIFokus = new Patient(rs.getString("Name"));
        }
    }

    // kommandoen til SQL databasen
    @Override
    public String returnSqlQuery() {
     
       String sqlStatement = "SELECT `navn` FROM `Patientinfo` WHERE `CPR` =" + Patient.getcprNumber();
       System.out.println(sqlStatement);
        return sqlStatement;
    }

    @Override
    public String returnSqlUpdate() {
        // TODO Auto-generated method stub
        return null;
    }
 }