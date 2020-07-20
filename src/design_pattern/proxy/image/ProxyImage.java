package design_pattern.proxy.image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filname;

    ProxyImage(String filname) {
        this.filname = filname;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filname);
        }
        this.realImage.display();
    }
}
