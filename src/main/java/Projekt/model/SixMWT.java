package Projekt.model;



public class SixMWT extends Datacategory {

    public int result;
    

    public SixMWT(String date, String doneBy, boolean graphValididy, String notes, int result) {
        super(date, doneBy, graphValididy, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValididy = graphValididy;
        this.notes = notes;
        this.result = result;
    }
}
