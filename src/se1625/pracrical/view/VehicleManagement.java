package se1625.pracrical.view;

import se1625.pracrical.controllers.Menu;
import se1625.pracrical.utils.Utils;
import se1625.pracrical.model.Vehicle;
import se1625.pracrical.controllers.VehicleCollection;

public class VehicleManagement {

    public static void main(String args[]) {
        Menu menu = new Menu();
        menu.addItem("Vehicle Management");
        menu.addItem("1. Add vehicle");
        menu.addItem("2. Update vehicle");
        menu.addItem("3. Search vehicle by description");
        menu.addItem("4. Sort vehicle by brand");
        menu.addItem("5. Show vehicle list");
        menu.addItem("6. Quit");
        VehicleCollection vehicleMap = new VehicleCollection();
        int choice = 0;
        boolean check = true;
        do {
            menu.showMenu();
            choice = Utils.getInt("Select your choice: ", 1, menu.size() - 1);
            switch (choice) {
                case 1:
                    if (vehicleMap.add()) {
                        vehicleMap.showInfor();
                        System.out.println("Successful!");
                    } else {
                        System.out.println("Unsuceessful!");
                    }
                    break;
                case 2:
                    if (vehicleMap.update()) {
                        vehicleMap.showInfor();
                        System.out.println("Successful!");
                    } else {
                        System.out.println("Unsuceessful!");
                    }
                    break;

                case 3:
                    String description = Utils.getString("Enter vehicle's description to search", false);
                    Vehicle tempVeh = vehicleMap.search(description);
                    if (tempVeh != null) {
                        tempVeh.showProfile();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    vehicleMap.sort();
                    break;
                case 5:
                    vehicleMap.showInfor();
                    break;
                case 6:
                    String quit = Utils.getString("Do you want to quit(Y/N): ");
                    if ("Y".equalsIgnoreCase(quit) || "YES".equalsIgnoreCase(quit)) {
                        check = false;
                    }
                    break;
                    
            }

        } while (check);
    }
}
