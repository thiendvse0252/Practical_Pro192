/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
* This is comment, do not delete 2021.12.30
 * and open the template in the editor.
 */
package se1625.pracrical.utils;

import java.util.Scanner;

/**
 *
 * @author hd
 */
public class Utils {

    public static String getString(String msg, boolean mayEmpty) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        boolean flag = true;
        while (flag) {
            try {
                System.out.print(msg + "(Can empty = " + mayEmpty + ")  ");
                result = sc.nextLine();
                if (result.isEmpty()) {
                    result = null;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try again!");
            }
            if (mayEmpty) {
                flag = false;
            }
            if (mayEmpty == false && result != null) {
                flag = false;
            }
        }
        return result;
    }

    public static String getString(String welcome, String oldData) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }

    public static int getInt(String welcome, int min, int max) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static int getInt(String welcome, int min, int max, int oldData) {
        boolean check = true;
        int number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static String getString(String wellcome) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(wellcome);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty()) {
                check = false;
                result = tmp;
            } else {
                System.out.println("Must enter text!");
            }
        } while (check);
        return result;
    }

}
