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
public class Boletin5_2Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     Satelite Satelite1=new Satelite();
     Satelite1.verPosicion();
    
     Satelite Satelite2=new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Inserta el meridiano:")) ,Double.parseDouble(JOptionPane.showInputDialog("Inserta el paralelo")) ,Double.parseDouble(JOptionPane.showInputDialog("Inserta la distancia a la tierra")));
    
     Satelite2.verPosicion();
        
        
    }
    
}

    
   
    

