package Generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1, "André");
        resultadoConcurso.adicionar(2, "Bruna");
        resultadoConcurso.adicionar(2, "Belarmino");
        resultadoConcurso.adicionar(3, "Vamilton");
        System.out.println(resultadoConcurso.getValor(2));
    }
}
