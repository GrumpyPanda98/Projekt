package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;
import Projekt.model.BMI;
import Projekt.model.Patient;
import Projekt.controller.SummaryCtrl;

public class BmiHandler implements Queryable {
    public ArrayList<BMI> listOfBMI = new ArrayList<>();
    
    private String cprNumber;


    public BmiHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {

    }
    
    public BmiHandler(String cprNumber) {
        this.cprNumber = cprNumber;
        DatabaseManipulator.executeQueryWithResultSet(this);

    }

	public void addBMIToList(BMI bh) {
        listOfBMI.add(bh);
    }

    public ArrayList<BMI> getListOfBMI() {
        return listOfBMI;
    }

	@Override
	public void processResultSet(ResultSet rs) throws SQLException {
		
		while (rs.next()){
            addBMIToList(new BMI(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"),rs.getString("BMI")));
        }
    
        
        
	}


    @Override
	public String returnSqlQuery() {
        if (SummaryCtrl.hospital) {
        String sqlStatement = "SELECT * FROM `EPJ` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `BMI` IS NOT NULL";
        return sqlStatement;
        }
        else {
            String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `BMI` IS NOT NULL";
            return sqlStatement;
        }
	}

}
