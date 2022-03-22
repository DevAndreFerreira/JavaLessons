package Lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String teste() {
        return "OK";
    }

    static String testeStatic() {return "OK";}
}
