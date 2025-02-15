package Exercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o item a ser adicionado: ");
        String item = sc.nextLine();
        carrinho.adicionarItem(item);
        System.out.println("O item " + item + " foi adicionado com sucesso!");

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        carrinho.adicionarPreco(preco);
        System.out.println("O preco " + preco + " foi adicionado com sucesso!");

        System.out.println("Digite o peso do produto: ");
        double peso = sc.nextDouble();




            Pagamento.pagar("cartao");
        }
}
