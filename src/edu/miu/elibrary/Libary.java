/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.miu.elibrary;

import edu.miu.elibrary.controller.SystemController;

/**
 *
 * @author Kuylim Tith
 */
public class Libary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Initial Project");
        SystemController controller = new SystemController();
        controller.getAllBooks();
    }
    
}
