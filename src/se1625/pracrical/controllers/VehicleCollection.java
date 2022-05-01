package se1625.pracrical.controllers;

import se1625.pracrical.view.I_Collection;
import java.util.HashMap;
import se1625.pracrical.model.Vehicle;
import se1625.pracrical.model.Car;
import se1625.pracrical.model.Motor;
import se1625.pracrical.utils.Utils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * This is comment, do not delete 2021.12.30
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
//require using map/......
public class VehicleCollection extends HashMap<String, Vehicle> implements I_Collection {

    @Override
    public boolean add() {
        boolean result = false;
        Vehicle tempVeh = null;
        int type = vehicleType();
        String code = Utils.getString("Enter vehicle's code: ", false);
        if (this.search(code) != null) {
            System.out.println("Code has exist!");
            result = false;
        }
        switch (type) {
            case 1:
                tempVeh = new Car(code, type);
                break;
            case 2:
                tempVeh = new Motor(code, type);
                break;
        }
        if (tempVeh.setInformation()) {
            this.put(code, tempVeh);
            result = true;
        }
        return result;
    }

    @Override
    public boolean update() {
        boolean result = false;
        String code = Utils.getString("Enter vehicle's code: ", false);
        Vehicle tempVeh = search(code);
        if (tempVeh == null) {
            System.out.println("Not found!");
        } else {
            tempVeh.updateInformation();
            result = true;
        }
        return result;
    }

    @Override
    public Vehicle search(String description) {
        List<Vehicle> list = new ArrayList<>(this.values());
        for (Vehicle vehicle : list) {
            if (vehicle.getDescription().equalsIgnoreCase(description)) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void showInfor() {
        for (String element : this.keySet()) {
            get(element).showProfile();
        }
    }

    @Override
    public boolean sort() {
        List<Vehicle> list = new ArrayList<>(this.values());
        Comparator<Vehicle> compareByBrand = (Vehicle o1, Vehicle o2) -> o1.getBrand().compareTo(o2.getBrand());
        Collections.sort(list, compareByBrand.reversed());
        for (Vehicle vehicle : list) {
            vehicle.showProfile();
        }
        return true;
    }

    public int vehicleType() {
        int choice;
        choice = Utils.getInt("Enter vehicle type: " + "\n" + "1. Car" + "\n"
                + "2. Motor" + "\n" + "Select your vehicle's type: ", 1, 2);
        return choice;
    }
}
