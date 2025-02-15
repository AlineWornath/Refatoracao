package Exercicio2;

import Exercicio1.CarrinhoDeCompras;

public class CalculoFrete extends CarrinhoDeCompras {
    public double calcularFrete () {
        if (getPesoTotal() < 5) {
            return 10.0;
        } else if (getPesoTotal() < 10) {
            return 20.0;
        } else {
            return 30.0;
        }
    }
}
