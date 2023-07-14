/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author ander
 */
public class Wire extends NotifierDecorator{
    
    public Wire(Notifier s) {
        super(s);
    }
    
    @Override
    public void send (String msg){
        super.send(msg);
        System.out.println("Enviado por Wire: "+msg);
    }
    
}
