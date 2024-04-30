/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.ligadura.presentacion;

import unipacifico.edu.ligadura.logica.Circulo;
import unipacifico.edu.ligadura.logica.LienzoFigura;
import unipacifico.edu.ligadura.logica.Rectangulo;
import unipacifico.edu.ligadura.logica.Triangulo;

/**
 *
 * @author ALUMNO-
 */
public class UsaFigura {
    public static void main(String[]args){
        
        Rectangulo rect= new Rectangulo();
        System.out.println(rect.dibujar());
        
        
        Circulo cir= new Circulo();
        Triangulo tri= new Triangulo();
        
        LienzoFigura lienzo= new LienzoFigura();
        System.out.println(lienzo.dibujarFigura(tri));
    }
}
