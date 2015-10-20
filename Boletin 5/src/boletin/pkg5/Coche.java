/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5;

/**
 *
 * @author slagogonzalez
 */
public class Coche {
    //ATRIBUTOS  
    private int velocidad ;
         
    //CONSTRUCTOR
    public Coche(){
        velocidad =0 ;
    }
           
    public int getVelocidad(){
        return velocidad;
    }
    //MÉTODOS
    public void acelerar(int valor){
        velocidad=velocidad+valor;
    }
    public void frenar(int valor){
        velocidad=velocidad-valor;
    }
    

}

