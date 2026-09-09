package assignments.observer;

public class Main {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Display display1 = new Display();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Website website1 = new Website();

        station.registerObserver(display1);
        station.registerObserver(phone1);
        station.registerObserver(website1);
        station.registerObserver(phone2);

        station.start();

        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Removing observer phone2");

        station.removeObserver(phone2);

        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
