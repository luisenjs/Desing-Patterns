package Tienda;

public class VIPCreditCardCreator extends CreditCardCreator {

    @Override
    public CreditCard crearTarjeta() {
        CreditCard cc = new VIPCreditCard();
        cc.configurarTarjeta();
        return cc;
    }
    
}
