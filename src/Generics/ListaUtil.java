package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtil {

    public static <T> T getUltimo(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("A", "B", "C");
        List<Integer> integers = Arrays.asList(1, 2, 3);


        if(integers.contains(1)) {
            System.out.println(Boolean.TRUE);
        }

        System.out.println(ListaUtil.getUltimo(strings));
        System.out.println(ListaUtil.getUltimo(integers));
    }

}
