package Projekt.model;

public class SmokeStatus extends Datacategory{

    public int result;
    

    public SmokeStatus(String date, String doneBy, boolean graphValididy, String notes, int result) {
        super(date, doneBy, graphValididy, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValididy = graphValididy;
        this.notes = notes;
        this.result = result;
    }
}
