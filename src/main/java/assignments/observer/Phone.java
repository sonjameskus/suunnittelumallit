package assignments.observer;

public class Phone implements WeatherObserver {

    @Override
    public void update(double temperature) {
        System.out.println("Phone: Temperature changed to " + temperature + "°C");
    }
}