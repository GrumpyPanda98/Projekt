package Projekt.model;


public class Weight extends Datacategory {

    public int result;
    

    public Weight(String date, String doneBy, boolean graphValididy, String notes, int result) {
        super(date, doneBy, graphValididy, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValididy = graphValididy;
        this.notes = notes;
        this.result = result;
    }
    
}
