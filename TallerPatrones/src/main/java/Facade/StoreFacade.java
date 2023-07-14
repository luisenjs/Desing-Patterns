/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author julio
 */
public class StoreFacade {
    
    String plataforma = "fisico";
    private int transacciones_realizadas = 0;
    private WebFacade web;
    private MovilFacade movil;
    private TelefonicoFacade telf;
    
    public StoreFacade(WebFacade web, MovilFacade movil, TelefonicoFacade telf) {
        this.web = web;
        this.movil = movil;
        this.telf = telf;
    }
    
    public void comprarProducto(String plat){
        
        int num_transacciones = 0;
        if (plataforma=="web"){
            num_transacciones = web.getNum_transacciones();
        } else if (plataforma=="movil"){
            num_transacciones = movil.getNum_transacciones();
        } else if (plataforma=="telefonico"){
            num_transacciones = telf.getNum_transacciones();
        }
        
        if (transacciones_realizadas<num_transacciones){
            web.consultarProductos();
            this.recibo();
        } else {
            return ;
        }
    }
    
    public void recibo(){
        
    }

    
    
    
}
