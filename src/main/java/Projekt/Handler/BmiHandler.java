package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Projekt.database.Queryable;
import Projekt.model.BMI;
import Projekt.model.Patient;


public class BmiHandler implements Queryable {
    public ArrayList<BMI> listOfBMI = new ArrayList<>(16);
    


    public BmiHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {
	}

	public void addBMIToList(BMI bh) {
        listOfBMI.add(bh);
    }

    public ArrayList<BMI> getListOfBMI() {
        return listOfBMI;
    }


/*
    public ArrayList<BMI> getBMIList() {
        return BmiHandler.listOfBMI;
    }
*/
	@Override
	public void processResultSet(ResultSet rs) throws SQLException {
		
		while (rs.next()){
            addBMIToList(new BMI(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"),rs.getString("BMI")));
              System.out.println(getListOfBMI().get(0).result);
              System.out.println(getListOfBMI().get(0).date);
        }
    
        
        
	}

	

	public void listOfBMI(String string, String string2, boolean b, String string3, float float1) {
    }

    @Override
	public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber();
        return sqlStatement;
	}

}
