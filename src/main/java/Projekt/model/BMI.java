package Projekt.model;

import Projekt.Handler.BmiHandler;
import Projekt.database.DatabaseManipulator;

public class BMI extends Datacategory {
    public static float result;

    public BMI(String date, String doneBy, boolean graphValididy, String notes, float result) {
        super(date, doneBy, graphValididy, notes);

        BMI.date = date;
        BMI.doneBy = doneBy;
        BMI.graphValididy = graphValididy;
        BMI.notes = notes;
        BMI.result = result;
    }

    public static void getHealthCaredata(String cprNumber) { // Opretter PersonHandler og henter sundhedsdata
        BmiHandler bh = new BmiHandler(date, doneBy, graphValididy, notes, result);
        DatabaseManipulator.executeQueryWithResultSet(bh);
        
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
    public float getResult() {
    return result;
    }
    @Override
    public boolean getGraphValidy() {
        // TODO Auto-generated method stub
        return super.getGraphValidy();
    }

}
