package Tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bienvenido...");
        System.out.println("**otros procesos del sistema**");
        System.out.println("Ingrese su nombre: ");
        String nombre = scn.nextLine();
        Customer c = new Customer(nombre);
        System.out.println("Ingrese su saldo: ");
        int saldo = scn.nextInt();
        if (saldo > 3000){
            CreditCardCreator ccc = new VIPCreditCardCreator();
            CreditCard cc = ccc.crearTarjeta();
            c.setCc(cc);
        }else if (saldo > 1300){
            CreditCardCreator ccc = new PremiumCreditCardCreator();
            CreditCard cc = ccc.crearTarjeta();
            c.setCc(cc);
        }else if (saldo > 420){
            CreditCardCreator ccc = new BasicCreditCardCreator();
            CreditCard cc = ccc.crearTarjeta();
            c.setCc(cc);
        }
        System.out.println("**resto del procesos**");
    }
}
