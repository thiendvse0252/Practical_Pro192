/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1625.pracrical.model;

/**
 *
 * @author DELL
 */
import se1625.pracrical.utils.Utils;

public class Motor extends Vehicle {

    public Motor(String code, int type) {
        super(code, type);
    }

    private String weight;

    public Motor(String weight, String code, String description, String color, String price, String brand, int type) {
        super(code, description, color, price, brand, type);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean updateInformation() {
        super.updateInformation();
        String newWeight = Utils.getString("Enter car's weight: ", true);
        if (newWeight != null) {
            setWeight(newWeight);
        }

        return true;
    }

    @Override
    public boolean setInformation() {
        super.setInformation();
        weight = Utils.getString("Enter car's weight: ", false);
        return true;
    }
    
    @Override
    public void showProfile() {
        System.out.println("Code: " + getCode() + "\t" + "Description: " + getDescription()
                + "\t" + "Color: " + getColor() + "\t" + "Price: " + getPrice()
                + "\t" + "Brand: " + getBrand() + "\t" + "Car's weight: "
                + getWeight() + "\n");
    }

}
