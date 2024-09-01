import java.util.List;

public class Demo {
    private static final String text = "Debra Morgan";

    public static void main(String[] args) {
        //Verifica se o texto está em branco ou nulo
        System.out.println(STR."IsBlank = \{text.isBlank()}");
        //Repete a string de acordo com parâmetro count
        System.out.println("So".repeat(2));
        //Faz a identação com parâmetro n
        System.out.println("Format line".indent(4));

        var content = "    Some text Here    ";
        System.out.println(STR."All leading and trailing white space removed:\{content.strip()}");

    }
}
