package design_pattern.proxy.web;

public class CloudServer implements Server{
    @Override
    public String request(int req) {
        System.out.println("Cloud - д серверт " + req + "хүсэлт ирлээ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (req == 1) {
            return "facebook.com";
        } else if (req == 2) {
            return "instagram.com";
        } else {
            return "request eror";
        }
    }
}
