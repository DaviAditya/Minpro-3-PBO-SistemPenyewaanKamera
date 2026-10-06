/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.Service;
import view.View;

/**
 *
 * @author Dovs
 */
public class Main {
    public static void main(String[] args) {
        final Service service = new Service();
        final View view = new View(service);
        view.jalankan();
    }
}
