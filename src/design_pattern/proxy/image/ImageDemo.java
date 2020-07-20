package design_pattern.proxy.image;

public class ImageDemo {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("phone.jpg");
        proxyImage.display();
        proxyImage.display();
        proxyImage.display();


        Image image = new RealImage("car.png");
        image.display();
        image.display();
        image.display();
    }
}
