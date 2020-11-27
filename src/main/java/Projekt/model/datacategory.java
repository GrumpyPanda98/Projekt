package Projekt.model;
import java.time;


public class Datacategory {
    private localdate date;
    private String doneBy;
    private boolean graphValidy;
    private String notes;

    public Datacategory(localdate date, String doneBy, boolean graphValidy, String notes){
        this.date = date;
        this.doneBy = doneBy;
        this.graphValidy = graphValidy;
        this.notes = notes;
    }


}

