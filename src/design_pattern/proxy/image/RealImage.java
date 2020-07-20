package design_pattern.proxy.image;

public class RealImage implements Image{
    private String name;

    RealImage(String name) {
        this.name = name;
        loadImage(name);
    }

    private void loadImage(String name) {
        System.out.println("Loaded: "+ name);
    }

    @Override
    public void display() {
        System.out.println("Dispay: " + this.name);
    }
}
