package com.mycompany.factura;

public class CorreccionFactura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;
    
    public void CalcularTotal(Deduccion deduccion , Iva iva){
        ImporteDeduccion= deduccion.CalculaDeduccion(ImporteFactura, PorcentajeDeduccion);
        ImporteIva= iva.CalculaIva(ImporteFactura);
        ImporteTotal= (ImporteFactura - ImporteDeduccion )+ ImporteIva;
    }
    
    
}