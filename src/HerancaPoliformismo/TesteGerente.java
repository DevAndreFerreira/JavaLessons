package HerancaPoliformismo;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("André");
        g1.setSalario(2000.00);
        g1.setCpf("12312312311");
        g1.getBonificacao();
        g1.autentica(123);
    }

}
