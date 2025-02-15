package Exercicio1;

public class Pagamento extends CarrinhoDeCompras{
    public static void pagar(String metodo) {
        if (metodo.equals("cartao" )) {
            System.out.println("Pagando com cartão de crédito..." );
        } else if (metodo.equals("paypal" )) {
            System.out.println("Pagando com PayPal..." );
        } else {
            System.out.println("Método de pagamento não suportado." );
        }
    }
}
