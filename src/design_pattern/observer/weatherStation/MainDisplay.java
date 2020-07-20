package design_pattern.observer.weatherStation;

public class MainDisplay implements Display, Observer{
    private float temp;
    private float humidity;
    private float pressure;


    MainDisplay(Subject subject) {
        subject.register(this);
    }

    @Override
    public void diplay() {
        System.out.println("Үндсэн дэлгэц: Темпратур: " + temp + "C Чийгшил: " + humidity + "% Даралт: " + pressure + "F");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        diplay();
    }
}
