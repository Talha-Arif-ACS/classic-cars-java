package tm.itbachelors.projectclassiccars.model;

// Talha Arif - r1066207
import java.util.ArrayList;

public class Owner extends Person {
    private int yearOfBirth;
    private String carCode;
    private ArrayList<String> wishList = new ArrayList<>();

    public Owner(String firstName, String surName) {
        super(firstName, surName);
        this.carCode = "undefined";
    }

    // getters
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCarCode() {
        return carCode;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public int getNumberOfWishes() {
        return wishList.size();
    }

    // setters
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    // wishlist method
    public boolean addToWishList(String carName) {
        if (wishList.size() < 5) {
            wishList.add(carName);
            return true;
        }
        return false;
    }

    // return formatted owner details
    @Override
    public String toString() {
        String nat = (getNationality() != null && !getNationality().isEmpty())
                ? " (" + getNationality() + ")"
                : "";
        return "Owner " + super.toString() + nat + " with car code " + carCode;
    }
}
