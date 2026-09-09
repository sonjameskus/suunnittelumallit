package assignments.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread {

    private double temperature;

    private final double MIN_TEMPERATURE = -40;
    private final double MAX_TEMPERATURE = 40;

    private List<WeatherObserver> observers = new ArrayList<>();

    private Random random = new Random();

    public WeatherStation() {
        temperature = -10 + random.nextInt(51);
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void run() {

        while (true) {

            int change = random.nextBoolean() ? 1 : -1;

            if (temperature + change <= MAX_TEMPERATURE
                    && temperature + change >= MIN_TEMPERATURE) {

                temperature += change;
            }

            System.out.println("Weather Station: " + temperature + "°C");

            notifyObservers();

            try {
                int waitTime = 1000 + random.nextInt(4001);
                Thread.sleep(waitTime);

            } catch (InterruptedException e) {
                System.out.println("Weather station stopped.");
                break;
            }
        }
    }
}