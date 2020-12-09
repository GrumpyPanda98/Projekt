package Projekt.Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Projekt.database.DatabaseManipulator;
import Projekt.database.Queryable;
import Projekt.model.MRC;
import Projekt.model.Patient;

public class MrcHandler implements Queryable {

    public ArrayList<MRC> listOfMrc = new ArrayList<>();
    
    private String cprNumber;


    public MrcHandler(String date, String doneBy, boolean graphValidity, String notes, String result) {



    }
    
    public MrcHandler(String cprNumber) {
        this.cprNumber = cprNumber;
        DatabaseManipulator.executeQueryWithResultSet(this);

    }

	public void addMrcToList(MRC bh) {
        listOfMrc.add(bh);
    }

    public ArrayList<MRC> getListOfMrc() {
        return listOfMrc;
    }

	@Override
	public void processResultSet(ResultSet rs) throws SQLException {
		
		while (rs.next()){
            addMrcToList(new MRC(rs.getString("dato"), rs.getString("sted"), rs.getString("notat"),rs.getString("MRC")));
        }
    
        
        
	}


    @Override
	public String returnSqlQuery() {
        String sqlStatement = "SELECT * FROM `PLS` WHERE `CPRnr` =" + Patient.getcprNumber();
        return sqlStatement;
	}
    
}
