package design_pattern.observer.weatherStation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WheaterStation {
    public static void main(String[] args) {
        WheatherData wheatherData = new WheatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(wheatherData);
        MainDisplay mainDisplay = new MainDisplay(wheatherData);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Дамжуулах мэдээлэл: Темпратур, Чийгшил, Даралт");
            try {
                float temp = scanner.nextFloat();
                float humidity = scanner.nextFloat();
                float pressure = scanner.nextFloat();
                wheatherData.setMeasurements(temp, humidity, pressure);
            } catch (InputMismatchException e) {
                System.out.println("Буруу өгөгдөл оруулсан байна: " + e);
                return;
            }
        }
    }
}
