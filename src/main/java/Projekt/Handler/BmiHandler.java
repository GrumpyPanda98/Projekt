package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.database.Queryable;
import Projekt.model.BMI;
import Projekt.model.Patient;


public class BmiHandler implements Queryable {
    public static ArrayList<BMI> listOfBMI = new ArrayList<>();
	
	
	public BmiHandler(String date, String doneBy, boolean graphValididy, String notes, float result) {
    }

    public void addBMIToList(BMI bh) {
    this.listOfBMI.add(bh);
    }

    public static ArrayList<BMI> getBMIList() {
        return BmiHandler.listOfBMI;
    }
    
	@Override
	public void processResultSet(ResultSet rs) throws SQLException {
		
		while (rs.next()){
            BmiHandler bmilist = new BmiHandler(rs.getString("dato"), rs.getString("sted"), true, rs.getString("notat"), rs.getFloat("BMI"));
                        
		}
		
	}

	

	@Override
	public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber();
        return sqlStatement;
	}

}
