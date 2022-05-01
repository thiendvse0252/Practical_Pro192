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

public abstract class Vehicle implements Comparable<Vehicle> {

    private String code;
    private String description;
    private String color;
    private String price;
    private String brand;
    private int type;

    public Vehicle(String code, int type) {
        this.code = code;
        this.type = type;
    }

    public Vehicle(String code, String description, String color, String price, String brand, int type) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getType() {
        return type;
    }

    public boolean setInformation() {
        description = Utils.getString("Enter vehicle's description: ", false);
        color = Utils.getString("Enter vehicle's color: ", false);
        price = Utils.getString("Enter vehicle's price: ", false);
        brand = Utils.getString("Enter vehicle's brand: ", false);
        return true;
    }

    public boolean updateInformation() {
        String newDescription = Utils.getString("Enter vehicle's description: ", true);
        String newColor = Utils.getString("Enter vehicle's color: ", true);
        String newPrice = Utils.getString("Enter vehicle's price: ", true);
        String newBrand = Utils.getString("Enter vehicle's brand: ", true);
        if (newDescription != null) {
            setDescription(newDescription);
        }
        if (newColor != null) {
            setColor(newColor);
        }
        if (newPrice != null) {
            setPrice(newPrice);
        }
        if (newBrand != null) {
            setBrand(newBrand);
        }
        return true;
    }

    public abstract void showProfile();

    @Override
    public int compareTo(Vehicle o) {
        return o.description.compareTo(this.description);
    }
}
