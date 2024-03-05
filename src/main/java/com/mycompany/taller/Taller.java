/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller;

/**
 *
 * @author sala8
 */
public class Taller {

    public static void main(String[] args) {
        
     GmailAccount gmail = new GmailAccount();
     gmail.emailAddress="afbarrios18@ucatolica.edu.co";
     gmail.name="Felipe";
     
     EmailSender.sendEmail(gmail, "asdasd");
     
    }
}
