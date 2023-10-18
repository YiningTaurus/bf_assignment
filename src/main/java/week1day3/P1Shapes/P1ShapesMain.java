package week1day3.P1Shapes;

public class P1ShapesMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.printArea(1, 1);
        Shape rectangle = new Rectangle();
        rectangle.printArea(2, 3);
        Shape triangle = new Triangle();
        triangle.printArea(3, 6);
    }
}
