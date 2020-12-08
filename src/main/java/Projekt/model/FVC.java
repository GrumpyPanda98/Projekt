package Projekt.model;



public class FVC extends Datacategory {

    public int result;
    

    public FVC(String date, String doneBy, boolean graphValidity, String notes, int result) {
        super(date, doneBy, graphValidity, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidity = graphValidity;
        this.notes = notes;
        this.result = result;
    }
}
