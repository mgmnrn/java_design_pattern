package design_pattern.decorator.circle;

public abstract class ShapeDecorator implements Shape {
    protected Shape decShape;

    public ShapeDecorator(Shape decShape) {
        this.decShape = decShape;
    }

    public void draw() {
        decShape.draw();
    }
}