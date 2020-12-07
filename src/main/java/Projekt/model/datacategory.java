
package Projekt.model;



public class Datacategory {
    protected String date;
    protected String doneBy;
    protected boolean graphValidy;
    protected String notes;

    public Datacategory(String date, String doneBy, boolean graphValidy, String notes){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidy = graphValidy;
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }
    public String getDoneBy() {
        return doneBy;
    }
    public String getNotes() {
        return notes;
    }

    public boolean getGraphValidy() {
        return graphValidy;
    }


}


