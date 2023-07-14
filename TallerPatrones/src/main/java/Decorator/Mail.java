/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author ander
 */
public class Mail implements Notifier{

    @Override
    public void send(String msg) {
        System.out.println("Enviado por Mail: "+msg);
    }
    
}
