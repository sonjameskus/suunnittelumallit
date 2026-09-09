package assignments.observer;

public class Website implements WeatherObserver {

    @Override
    public void update(double temperature) {
        System.out.println("Website: New temperature is " + temperature + "°C");
    }
}