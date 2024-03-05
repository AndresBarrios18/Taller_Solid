/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author sala8
 */
public class GmailAccount implements Interfaz_Contacto {
    
    String name, emailAddress;


    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTelephone() {
        return null;
    }
}
