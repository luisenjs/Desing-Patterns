/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author julio
 */
public class WebFacade {
    
    int num_transacciones=100;

    public WebFacade() {
    }

    public int getNum_transacciones() {
        return num_transacciones;
    }
    
    public void consultarProductos(){
        
        MovilFacade mf = new MovilFacade();
        mf.chatDudas();
        
        TelefonicoFacade tf = new TelefonicoFacade();
        tf.llamarAsesores();
    }
    
}
