
package Projekt.model;



public abstract class Datacategory {
    private String date;
    private String doneBy;
    private boolean graphValidity;
    private String notes;
    private String result;

    public Datacategory(String date, String doneBy, boolean graphValidity, String notes, String result){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidity = graphValidity;
        this.notes = notes;
        this.result = result;
    }

    public Datacategory(String date, String doneBy, String notes, String result){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidity = true;
        this.notes = notes;
        this.result = result;
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
    public String getResult() {
        return result;
    }

    public boolean getGraphValidity() {
        return graphValidity;
    }


}


