package se1625.pracrical.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
* This is comment, do not delete 2021.12.30
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
import java.util.ArrayList;
import se1625.pracrical.utils.Utils;
import se1625.pracrical.view.I_Menu;

public class Menu extends ArrayList<String> implements I_Menu {

    public Menu() {
        super();
    }
    // must implement all abstract method of I_Menu interface

    @Override
    public void addItem(String s) {
        add(s);
    }

    @Override
    public void showMenu() {
        for (String s : this) {
            System.out.println(s);
        }
    }
}
