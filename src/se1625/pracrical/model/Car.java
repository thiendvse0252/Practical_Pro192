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

public class Car extends Vehicle {

    public Car(String code, int type) {
        super(code, type);
    }
    private String engine;
    private String aiSystem;

    public Car(String engine, String aiSystem, String code, String description, String color, String price, String brand, int type) {
        super(code, description, color, price, brand, type);
        this.engine = engine;
        this.aiSystem = aiSystem;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAiSystem() {
        return aiSystem;
    }

    public void setAiSystem(String aiSystem) {
        this.aiSystem = aiSystem;
    }

    @Override
    public boolean updateInformation() {
        super.updateInformation();
        String newEngine = Utils.getString("Enter car's type of engine: ", true);
        String newAiSystem = Utils.getString("Enter car's Ai system (y/n): ", true);
        if (newEngine != null) {
            setEngine(newEngine);
        }
        if (newAiSystem != null) {
            setAiSystem(newAiSystem);
        }
        return true;
    }

    @Override
    public boolean setInformation() {
        super.setInformation();
        engine = Utils.getString("Enter car's type of engine: ", false);
        aiSystem = Utils.getString("Enter car's Ai system (y/n): ", false);
        return true;
    }

    @Override
    public void showProfile() {
        System.out.println("Code: " + getCode() + "\t" + "Description: " + getDescription()
                + "\t" + "Color: " + getColor() + "\t" + "Price: " + getPrice()
                + "\t" + "Brand: " + getBrand() + "\t" + "Car's engine: "
                + getEngine() + "\t" + "AI system: " + getAiSystem()
                + "\n");
    }

}
