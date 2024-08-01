import java.util.*;

public class Main {
    public static void main(String[] args) {
        SequencedSet set = new LinkedHashSet();
        set.add("Buenos Aires");
        set.add("Brasilia");
        set.add("Santiago");

        System.out.println("Primeiro elemento: " + set.getFirst());
        System.out.println("Último Elemento: " + set.getLast());

        System.out.println("Lista invertida" + set.reversed());
        System.out.println("===============");
        System.out.println("Removendo primeiro elemento: " + set.removeFirst());
        System.out.println("===============");
        System.out.println(set);
        System.out.println("Removendo último elemento: " + set.removeLast());
        System.out.println(set);
        set.addFirst("La Paz");
        System.out.println("Adicionado elemento na primeira posição: " + set);
        set.addLast("Quito");
        System.out.println("Adicionado elemento na última posição: " + set);

        SequencedMap<Integer, String> europa = new LinkedHashMap<>();
        europa.putFirst(1, "Paris");
        europa.put(2, "Roma");
        europa.putLast(3, "Berlim");

        List<Double> lista = new ArrayList();
        lista.addFirst(Math.PI);
        System.out.println(europa);

        System.out.println("VALOR DE PI = " + lista.getFirst());
    }
}