import static java.lang.StringTemplate.STR;

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println(STR."[Rectangle] Length = \{rectangle.length()} Width = \{rectangle.width()}");
        Circle circle = new Circle(2.5);
        circle.radius();
        System.out.println(STR."[Circle] Radius = \{circle.radius()}");
    }
}
