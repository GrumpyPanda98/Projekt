package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.controller.SummaryCtrl;
import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;
import Projekt.model.Patient;
import Projekt.model.WeightChange;

public class WeightChangeHandler implements Queryable {
    
    public ArrayList<WeightChange> listOfWeight = new ArrayList<>();
    
    private String cprNumber;


    public WeightChangeHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {

    }

    public WeightChangeHandler(String cprNumber) {
    this.cprNumber = cprNumber;
    DatabaseManipulator.executeQueryWithResultSet(this);

    }

    public void addWeightChangeToList(WeightChange bh) {
    listOfWeight.add(bh);
    }

    public ArrayList<WeightChange> getListOfWeight() {
    return listOfWeight;
    }

    @Override
    public void processResultSet(ResultSet rs) throws SQLException {
    
    while (rs.next()){
            addWeightChangeToList(new WeightChange(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"), rs.getString("vaegt")));
    }
  
    }


    @Override
    public String returnSqlQuery() {
        if (SummaryCtrl.hospital) {
            String sqlStatement = "SELECT * FROM `EPJ` WHERE `CPRnr` =" + Patient.getcprNumber()+ " AND `vaegt` IS NOT NULL";
            return sqlStatement;
            }
            else {
                String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber() + " AND `vaegt` IS NOT NULL";
                return sqlStatement;
            }

    }

}

