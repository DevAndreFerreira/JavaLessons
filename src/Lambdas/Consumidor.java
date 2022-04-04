package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto prod = new Produto("Caneta", 12.34, 0.00);
        Produto prod1 = new Produto("Borracha", 0.50, 0.00);
        Produto prod2 = new Produto("Lápis", 1.00, 0.00);
        imprimir.accept(prod);

        List<Produto> produtos = Arrays.asList(prod, prod1, prod2);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }

}
