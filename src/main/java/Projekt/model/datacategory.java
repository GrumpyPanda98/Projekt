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


}

