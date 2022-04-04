package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Gui", "Gih", "Lia");

        for(String nome: aprovados) {
            System.out.println("Nome: " + nome);
        }

        aprovados.forEach(nome -> {
            System.out.println("Aprovados: " + nome);
        });
        System.out.println("\n Method Reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\n lambda #01");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\n Method Reference...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Meu nome é " + nome);
    }
}
