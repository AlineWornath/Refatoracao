package Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {
    private List<String> itens = new ArrayList<>();
    public void adicionarItem (String item) {
        itens.add(item);
    }

    private List<Double> precos = new ArrayList<>();
    public void adicionarPreco(double preco) {
        precos.add(preco);
    }

    private List<String> itens2 = new ArrayList <>();
    private double pesoTotal;
    private void adicionarPeso (String item, double peso) {
        itens2.add(item);
        pesoTotal += peso;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double calcularTotal() {
        double total = 0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }

    Map<String,String> map = new HashMap<String,String>();
}


