package Tienda;

public class BasicCreditCardCreator extends CreditCardCreator {

    @Override
    public CreditCard crearTarjeta() {
        CreditCard cc = new BasicCreditCard();
        cc.configurarTarjeta();
        return cc;
    }
    
}
