package Tienda;

public class PremiumCreditCardCreator extends CreditCardCreator {

    @Override
    public CreditCard crearTarjeta() {
        CreditCard cc = new PremiumCreditCard();
        cc.configurarTarjeta();
        return cc;
    }
    
}
