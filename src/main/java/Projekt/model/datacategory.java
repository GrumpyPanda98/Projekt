
package Projekt.model;



public class Datacategory {
    protected static String date;
    protected static String doneBy;
    protected static boolean graphValididy;
    protected static String notes;

    public Datacategory(String date, String doneBy, boolean graphValididy, String notes){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValididy = graphValididy;
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
        return graphValididy;
    }


}


