/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ocp;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author sala8
 */
public class OCP {
Vector<Figura> figuras = new Vector<Figura>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        Enumeration<Figura> figs = figuras.elements();
        while (figs.hasMoreElements()) {
            Figura f = figs.nextElement();
            f.dibujar();
        }
    }
    
}
