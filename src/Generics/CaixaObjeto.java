package Generics;

public class CaixaObjeto {

    private Object coisa;

    public static void main(String[] args) {
        CaixaObjeto caixa1 = new CaixaObjeto();
        caixa1.guardar(2.3);
        Double retorno = (Double) caixa1.abrir();
        //Integer retornoInteger = (Integer) caixa1.abrir();
    }

    public void guardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abrir() {
        return coisa;
    }

}
