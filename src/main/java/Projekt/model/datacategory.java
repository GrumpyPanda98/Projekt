
package Projekt.model;



public class Datacategory {
    public static String date;
    public static String doneBy;
    public static boolean graphValidity;
    public static String notes;

    public Datacategory(String date, String doneBy, boolean graphValidity, String notes){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidity = graphValidity;
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

    public boolean getGraphValidity() {
        return graphValidity;
    }


}


