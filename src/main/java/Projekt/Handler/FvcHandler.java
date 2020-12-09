package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;
import Projekt.model.FVC;
import Projekt.model.Patient;

public class FvcHandler implements Queryable {

    public ArrayList<FVC> listOfFVC = new ArrayList<>();
    
    private String cprNumber;


    public FvcHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {



    }
    
    public FvcHandler(String cprNumber) {
        this.cprNumber = cprNumber;
        DatabaseManipulator.executeQueryWithResultSet(this);

    }

	public void addFVCToList(FVC bh) {
        listOfFVC.add(bh);
    }

    public ArrayList<FVC> getListOfFVC() {
        return listOfFVC;
    }

	@Override
	public void processResultSet(ResultSet rs) throws SQLException {
		
		while (rs.next()){
            addFVCToList(new FVC(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"),rs.getString("FVC")));
        }
    
        
        
	}


    @Override
	public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber();
        return sqlStatement;
	}

}