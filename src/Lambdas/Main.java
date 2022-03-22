package Lambdas;

public class Main {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println("Soma: " + calculo.executar(1,2));

        calculo = new Multiplicar();
        System.out.println("Multi: " + calculo.executar(2,2));

        Calculo calc = (x, y) -> { return x + y; };
        System.out.println("Soma com lambdas: " + calc.executar(2,3));

        calc = (x, y) -> x * y;
        System.out.println("Multi: " + calc.executar(1,3));
    }
}
