package Projekt.model;



public class MRC extends Datacategory {

    public int result;
    

    public MRC(String date, String doneBy, boolean graphValidy, String notes, int result) {
        super(date, doneBy, graphValidy, notes);
        
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidy = graphValidy;
        this.notes = notes;
        this.result = result;
    }
}
