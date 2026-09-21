package tm.itbachelors.projectclassiccars.model;

// Talha Arif - r1066207

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Staff extends Person {
    private LocalDate startDate;
    private boolean senior;

    public Staff(String firstName, String surName) {
        super(firstName, surName);
        this.startDate = LocalDate.now();
        this.senior = false;
    }

    // getters
    public LocalDate getStartDate() {
        return startDate;
    }

    public boolean isSenior() {
        return senior;
    }

    // setters
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    // return formatted staff details
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String prefix = senior ? "Senior staff member " : "Staff member ";
        return prefix + super.toString() + " is employed since " + startDate.format(dtf);
    }
}