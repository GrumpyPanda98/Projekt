package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Projekt.model.Patient;
import Projekt.model.SmokeStatus;
import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;

public class SmokeStatusHandler implements Queryable {
    
    public ArrayList<SmokeStatus> listOfSmokeStatus = new ArrayList<>();
    private String cprNumber;

    public SmokeStatusHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {



    }
    
    public SmokeStatusHandler(String cprNumber) {
        this.cprNumber = cprNumber;
        DatabaseManipulator.executeQueryWithResultSet(this);

    }

	public void addSmokeStatusToList(SmokeStatus bh) {
        listOfSmokeStatus.add(bh);
    }

    public ArrayList<SmokeStatus> getListOfSmokeStatus() {
        return listOfSmokeStatus;
    }


    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        while (rs.next()){
            addSmokeStatusToList(new SmokeStatus(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"), rs.getString("rygestatus")));
        }

    }

    @Override
    public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber();
        return sqlStatement;
	}
    
}
