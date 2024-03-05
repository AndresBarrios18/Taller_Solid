
package com.mycompany.taller;


public class Contacto implements Interfaz_Contacto {
    
    String name,address,emailAdress,telephone;
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getEmailAddress() {
    
        return emailAdress;
    
    }

    @Override
    public String getTelephone() {
            
        return telephone;

    }


    
}
