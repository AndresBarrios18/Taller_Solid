package com.mycompany.configuracion;

public class Main {
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();

        // Cargar configuración
        System.out.println("Cargando configuración...");
        configuracion.cargarConfiguracion();
        System.out.println("Configuración cargada.");

        // Salvar configuración
        System.out.println("Salvando configuración...");
        configuracion.salvarConfiguracion();
        System.out.println("Configuración salvada.");
    }
}
