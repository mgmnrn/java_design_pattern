package design_pattern.proxy.web;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Server cloud = new CloudServer();
        Server proxy = new ProxyServer(cloud);
        Scanner scanner = new Scanner(System.in);
        int val;
        while (true) {
            System.out.println("Ямар хүсэлт явуулах вэ?");
            val = scanner.nextInt();
            System.out.println("Browser: " + proxy.request(val));
        }
    }
}
