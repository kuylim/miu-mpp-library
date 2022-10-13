/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.miu.elibrary;

import edu.miu.elibrary.auth.SecurityContext;
import edu.miu.elibrary.ui.LoginView;
import edu.miu.elibrary.ui.MainView;

import java.util.Objects;

/**
 * @author Kuylim Tith
 */
public class Libary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainView mainView = new MainView();
        if (!Objects.isNull(SecurityContext.principal)) {
            mainView.setVisible(true);
        } else {
            LoginView loginView = new LoginView();
            loginView.setVisible(true);
        }
    }
}
