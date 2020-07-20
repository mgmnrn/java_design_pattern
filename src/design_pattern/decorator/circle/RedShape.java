package design_pattern.decorator.circle;

public class RedShape extends ShapeDecorator {
    RedShape(Shape decShape) {
        super(decShape);
    }

    @Override
    public void draw() {
        decShape.draw();
        this.setRedBorder(decShape);
    }

    private void setRedBorder(Shape decShape) {
        System.out.println("Border color red");
    }
}
