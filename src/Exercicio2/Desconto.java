package Exercicio2;

import Exercicio1.CarrinhoDeCompras;

public class Desconto extends CarrinhoDeCompras {
    public double aplicarDesconto(String tipo) {
        if (tipo.equals("natal")) {
            return calcularTotal() * 0.9; // 10% de desconto
        } else if (tipo.equals("black_friday")) {
            return calcularTotal() * 0.8; // 20% de desconto
        }
        return calcularTotal();
    }
}
