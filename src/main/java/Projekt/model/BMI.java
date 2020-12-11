package Projekt.model;


public class BMI extends Datacategory {

    public BMI(String date, String doneBy, boolean graphValidity, String notes, String result) {
        super(date, doneBy, graphValidity, notes, result);
    }

    public BMI(String date, String doneBy, String notes, String result) {
        super(date, doneBy, notes, result);
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

    @Override
    public String getResult() {
        return super.getResult();
    }
    @Override
    public boolean getGraphValidity() {
        // TODO Auto-generated method stub
        return super.getGraphValidity();
    }

}
