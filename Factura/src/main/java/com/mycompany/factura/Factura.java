public class Factura {
public String codigo;
public Date fechaEmision;
public float importeFactura;
public float importeIVA;
public float importeDeduccion;
public float importeTotal;
public int porcentajeDeduccion;
// Método que calcula el total de la factura
public void calcularTotal() {
 // Calculamos la deducción
 Deduccion d=new Deduccion();
 importeDeduccion = d.calculaDeduccion(importeFactura, porcentajeDeduccion);
 Iva iva=new Iva();
 // Calculamos el IVA
 importeIVA = iva.calculaIva(importeFactura);
 // Calculamos el total
importeTotal = (importeFactura - importeDeduccion) + importeIVA;
}
}