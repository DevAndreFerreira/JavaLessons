package Generics;

public class CaixaGenerics<T> {

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }

    public static void main(String[] args) {
        CaixaGenerics<String> caixaS = new CaixaGenerics<>();
        CaixaGenerics<Integer> caixaI = new CaixaGenerics<>();
        caixaS.guardar("123");
        System.out.println(caixaS.abrir());
        caixaI.guardar(1);
        System.out.println(caixaI.abrir());
    }

}
