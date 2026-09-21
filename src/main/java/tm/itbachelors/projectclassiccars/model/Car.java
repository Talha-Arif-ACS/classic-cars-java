package tm.itbachelors.projectclassiccars.model;

// Talha Arif - r1066207
import java.util.ArrayList;

public class Car {
    private String brand;
    private String type;
    private int kilometers;
    private String photo;
    private ArrayList<Maintenance> maintenances = new ArrayList<>();

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // getters
    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getKilometers() {
        return kilometers;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return brand + " - " + type;
    }

    public ArrayList<Maintenance> getMaintenances() {
        return maintenances;
    }

    public int getNumberOfMaintenances() {
        return maintenances.size();
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKilometers(int kilometers) {
        if (kilometers > this.kilometers) {
            this.kilometers = kilometers;
        }
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // maintenance methods
    public void addMaintenance(Maintenance maintenance) {
        maintenances.add(maintenance);
    }

    public Maintenance searchMaintenanceByType(String type) {
        for (Maintenance m : maintenances) {
            if (m.getType().equals(type)) {
                return m;
            }
        }
        return null;
    }

    // owner registration
    public void registerOwner(Owner owner) {
        String code = brand.substring(0, 2).toUpperCase()
                + "_" + type.substring(0, 2).toUpperCase()
                + "_" + kilometers;
        owner.setCarCode(code);
    }
}
