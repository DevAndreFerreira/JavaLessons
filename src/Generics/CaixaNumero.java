package Generics;

public class CaixaNumero<N extends Number> extends CaixaGenerics<N>{

    public static void main(String[] args) {
        CaixaNumero<Double> caixaD = new CaixaNumero<>();
        CaixaNumero<Integer> caixaI = new CaixaNumero<>();

        caixaD.guardar(2.3);
        caixaI.guardar(1);

        System.out.println(caixaD.abrir());
        System.out.println(caixaI.abrir());
    }
}
