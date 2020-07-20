package design_pattern.observer.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {
    private List<Observer> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WheatherData() {
        observers = new ArrayList<>();
    }

    public float getTemprature() {
        return temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measureMentsChanged();
    }

    private void measureMentsChanged() {
        notification();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        observers.forEach(ob -> ob.update(this.temprature, this.humidity, this.pressure));
    }
}
