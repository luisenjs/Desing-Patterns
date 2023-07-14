package Tienda;

public class BasicCreditCard implements CreditCard{
    
    private double costoMensual;
    private double créditoLímite;

    public BasicCreditCard() {
        
    }

    @Override
    public void configurarTarjeta() {
        costoMensual = 149.99;
        créditoLímite = 400.00;
        System.out.println("Tarjeta creada con un crédito límite de $" + créditoLímite + " y un costo mensual de $" + costoMensual);
    }
    
}
