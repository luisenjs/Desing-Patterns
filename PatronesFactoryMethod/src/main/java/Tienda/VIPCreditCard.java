package Tienda;

public class VIPCreditCard implements CreditCard {
    
    private double costoMensual;
    private double créditoLímite;

    public VIPCreditCard() {
        
    }

    @Override
    public void configurarTarjeta() {
        costoMensual = 600.00;
        créditoLímite = 3500.00;
        System.out.println("Tarjeta creada con un crédito límite de $" + créditoLímite + " y un costo mensual de $" + costoMensual);
    }
    
}
