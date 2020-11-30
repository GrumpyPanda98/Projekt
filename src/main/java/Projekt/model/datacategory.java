package Projekt.model;
import java.time.LocalDate;


public class Datacategory {
    private LocalDate date;
    private String doneBy;
    private boolean graphValidy;
    private String notes;

    public Datacategory(LocalDate date, String doneBy, boolean graphValidy, String notes){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidy = graphValidy;
        this.notes = notes;
    }

    public LocalDate getDate() {
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

