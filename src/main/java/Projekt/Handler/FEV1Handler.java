package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.model.FEV1;
import Projekt.model.Patient;
import Projekt.controller.SummaryCtrl;
import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;

public class FEV1Handler implements Queryable {
    
    public ArrayList<FEV1> listOfFEV1 = new ArrayList<>();
    private String cprNumber;

    public FEV1Handler(String date, String doneBy, boolean graphValidity, String notes, String result) {



    }
    
    public FEV1Handler(String cprNumber) {
        this.cprNumber = cprNumber;
        DatabaseManipulator.executeQueryWithResultSet(this);

    }

	public void addFEV1ToList(FEV1 bh) {
        listOfFEV1.add(bh);
    }

    public ArrayList<FEV1> getListOfFEV1() {
        return listOfFEV1;
    }


    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
        while (rs.next()){
            addFEV1ToList(new FEV1(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"), rs.getString("FEV1")));
        }

    }

    @Override
    public String returnSqlQuery() {
        if (SummaryCtrl.hospital){
        String sqlStatement = "SELECT * FROM `EPJ` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `FEV1` IS NOT NULL";
        return sqlStatement;
        }
        else {
            String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `FEV1` IS NOT NULL";
        return sqlStatement;
        }
	}
    
}
