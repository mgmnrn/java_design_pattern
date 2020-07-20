package design_pattern.strategy.Calculator;

public class DivideOperation implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
