package Projekt.model;



public class WeightChange extends Datacategory {

    public WeightChange(String date, String doneBy, String notes, String result) {
        super(date, doneBy, notes, result);
    }
    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public String getDoneBy() {
        return super.getDoneBy();
    }
    
    @Override
    public String getNotes() {
        return super.getNotes();
    }

    @Override
    public String getResult() {
        return super.getResult();
    }
    @Override
    public boolean getGraphValidity() {
        return super.getGraphValidity();
    }
}
