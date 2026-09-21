package tm.itbachelors.projectclassiccars.model;

// Talha Arif - r1066207

public class Maintenance {
    private String type;
    private int duration;
    private double hourlyRate;
    private Staff responsible;

    public Maintenance() {}

    public Maintenance(String type) {
        this.type = type;
    }

    public Maintenance(String type, int duration, double hourlyRate) {
        this.type = type;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
    }

    // getters
    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getPrice() {
        return hourlyRate * duration / 60.0;
    }

    public Staff getResponsible() {
        return responsible;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setResponsible(Staff responsible) {
        this.responsible = responsible;
    }
}
