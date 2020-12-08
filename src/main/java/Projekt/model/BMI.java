package Projekt.model;

import Projekt.Handler.BmiHandler;
import Projekt.database.DatabaseManipulator;

public class BMI extends Datacategory {
    public String result;

    public BMI(String date, String doneBy, boolean graphValidity, String notes, String result) {
        super(date, doneBy, graphValidity, notes);

        this.date = date;
        this.doneBy = doneBy;
        this.graphValidity = graphValidity;
        this.notes = notes;
        this.result = result;
    }

    public BMI(String date, String doneBy, String notes, String result) {
        super(date, doneBy, graphValidity, notes);

        this.date = date;
        this.doneBy = doneBy;
        this.notes = notes;
        this.result = result;
    }


    public void getHealthCaredata(String cprNumber) { // Opretter PersonHandler og henter sundhedsdata
        BmiHandler p = new BmiHandler(date, doneBy, graphValidity, notes, result);
        DatabaseManipulator.executeQueryWithResultSet(p);
        
    }

	@Override
    public String getDate() {
        // TODO Auto-generated method stub
        return super.getDate();
    }

    @Override
    public String getDoneBy() {
        // TODO Auto-generated method stub
        return super.getDoneBy();
    }
    
    @Override
    public String getNotes() {
        // TODO Auto-generated method stub
        return super.getNotes();
    }
    public String getResult() {
    return result;
    }
    @Override
    public boolean getGraphValidity() {
        // TODO Auto-generated method stub
        return super.getGraphValidity();
    }

}
