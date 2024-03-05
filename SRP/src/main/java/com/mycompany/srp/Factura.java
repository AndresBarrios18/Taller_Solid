
package com.mycompany.srp;

import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeTotal;

    public void calcularTotal(int porcentajeDeduccion) {
        CalculadoraDeduccion calculadoraDeduccion = new CalculadoraDeduccion();
        CalculadoraIva calculadoraIVA = new CalculadoraIva();

        float importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        float importeIVA = calculadoraIVA.calcularIVA(importeFactura);

        importeTotal = importeFactura - importeDeduccion + importeIVA;
    }
}

