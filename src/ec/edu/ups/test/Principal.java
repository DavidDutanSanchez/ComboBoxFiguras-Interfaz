/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.clases.Secundaria;

/**
 *
 * @author surfa
 */
public class Principal {
     public static void main(String[] args) {
            Secundaria secundaria= new Secundaria();
            secundaria.initComponentes();
            secundaria.setVisible(true);
    }
}
