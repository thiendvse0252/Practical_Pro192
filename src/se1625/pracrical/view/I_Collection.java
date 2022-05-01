/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1625.pracrical.view;

/**
 *
 * @author DELL
 */
import se1625.pracrical.model.Vehicle;

public interface I_Collection {

    public boolean add();

    public boolean update();

    public Vehicle search(String description);

    public void showInfor();

    public boolean sort();
}
