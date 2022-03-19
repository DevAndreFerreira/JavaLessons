package Generics;

public class CaixaInt extends CaixaGenerics<Integer> {

    public static void main(String[] args) {
        CaixaInt caixaInt = new CaixaInt();
        caixaInt.guardar(1);
        System.out.println(caixaInt.abrir());

    }

}
