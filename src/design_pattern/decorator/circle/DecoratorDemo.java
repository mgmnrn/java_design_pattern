package design_pattern.decorator.circle;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redShape = new RedShape(circle);
        Shape redRectangle = new RedShape(rectangle);

        redShape.draw();
        redRectangle.draw();
    }
}