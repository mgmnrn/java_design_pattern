package design_pattern.singleton.chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("Filled");
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Drain");
            empty = true;
        }
    }

    public void boil() {
        if (!isBoiled() && !isEmpty()) {
            System.out.println("Boiled");
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();

        chocolateBoiler.boil();
        chocolateBoiler.boil();

        chocolateBoiler.drain();
        chocolateBoiler.drain();
    }
}
