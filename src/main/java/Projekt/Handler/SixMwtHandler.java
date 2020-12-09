package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.controller.SummaryCtrl;
import Projekt.database.*;
import Projekt.database.Queryable;
import Projekt.model.Patient;
import Projekt.model.SixMWT;

public class SixMwtHandler implements Queryable {
    
    public ArrayList<SixMWT> listOfSixMWT = new ArrayList<>();
    
    private String cprNumber;


    public SixMwtHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {

    }

    public SixMwtHandler(String cprNumber) {
    this.cprNumber = cprNumber;
    DatabaseManipulator.executeQueryWithResultSet(this);

    }

    public void addMwtToList(SixMWT bh) {
    listOfSixMWT.add(bh);
    }

    public ArrayList<SixMWT> getListOfSixMwt() {
    return listOfSixMWT;
    }

    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
    
    while (rs.next()){
        addMwtToList(new SixMWT(rs.getString("dato"), rs.getString("sted"),rs.getString("notat"),rs.getString("sixMWT")));
    }
  
    }


    @Override
    public String returnSqlQuery() {
        if (SummaryCtrl.hospital) {
            String sqlStatement = "SELECT * FROM `EPJ` WHERE `CPRnr` =" + Patient.getcprNumber()+ " AND `sixMWT` IS NOT NULL";
            return sqlStatement;
            }
            else {
                String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `sixMWT` IS NOT NULL";
                return sqlStatement;
            }
        }
}

