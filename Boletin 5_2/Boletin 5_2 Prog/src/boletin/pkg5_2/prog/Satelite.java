/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5_2.prog;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */

public class Satelite  {
 
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public Satelite ( double m, double p , double d ) {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public double getMeridiano(){
        return meridiano;
    }
    public double getParalelo(){
        return paralelo;
    }
    public double getDistancia(){
        return distanciaTerra;
    }
public void verPosicion () {
    JOptionPane.showMessageDialog (null, " el satelite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + " y a una distancia de la tierra de " + distanciaTerra);
}

}
