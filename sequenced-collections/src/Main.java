import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

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
    }
}