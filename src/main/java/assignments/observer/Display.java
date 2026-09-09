package assignments.observer;

public class Display implements WeatherObserver {

    @Override
    public void update(double temperature) {
        System.out.println("Display: Temperature is now " + temperature + "°C");
    }
}