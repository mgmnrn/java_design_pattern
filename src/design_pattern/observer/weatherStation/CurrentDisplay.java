package design_pattern.observer.weatherStation;

public class CurrentDisplay implements Display, Observer {
    private float temp;
    private float humidity;

    CurrentDisplay(Subject subject) {
        subject.register(this);
    }

    @Override
    public void diplay() {
        System.out.println("Одоогийн дэлгэц: Темпратур: " + temp + " Чийгшил: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        diplay();
    }
}
