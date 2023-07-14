package Tienda;

public class PremiumCreditCard implements CreditCard {
    
    private double costoMensual;
    private double créditoLímite;

    public PremiumCreditCard() {
        
    }

    @Override
    public void configurarTarjeta() {
        costoMensual = 300.00;
        créditoLímite = 1000.00;
        System.out.println("Tarjeta creada con un crédito límite de $" + créditoLímite + " y un costo mensual de $" + costoMensual);
    }
    
}
