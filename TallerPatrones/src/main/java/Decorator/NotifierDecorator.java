/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author ander
 */
public abstract class NotifierDecorator implements Notifier{
    protected Notifier wrappee;
    
    public NotifierDecorator (Notifier s){
        this.wrappee = s;
    }
    
    @Override
    public void send (String msg){
        wrappee.send(msg);
    }
    
}
