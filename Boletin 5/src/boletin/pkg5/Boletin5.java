/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
       Coche Coche1 = new Coche();
              
       JOptionPane.showMessageDialog(null, "velocidad inicial : "+Coche1.getVelocidad());
       
       String aceleraString = JOptionPane.showInputDialog("Velocidad para acelerar:");
       Coche1.acelerar(Integer.parseInt(aceleraString));
       
       JOptionPane.showMessageDialog(null, "La velocidad tras acelerar es : "+Coche1.getVelocidad());
       String frenarString = JOptionPane.showInputDialog("Teclea frenada:");
       
       Coche1.frenar(Integer.parseInt(frenarString));
       JOptionPane.showMessageDialog(null, "La velocidad tras frenar es : "+Coche1.getVelocidad());
       
    }
    
}
