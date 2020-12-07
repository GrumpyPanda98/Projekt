package Projekt.model;



public class FVC extends Datacategory {

    public int result;
    

    public FVC(String date, String doneBy, boolean graphValididy, String notes, int result) {
        super(date, doneBy, graphValididy, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValididy = graphValididy;
        this.notes = notes;
        this.result = result;
    }
}
