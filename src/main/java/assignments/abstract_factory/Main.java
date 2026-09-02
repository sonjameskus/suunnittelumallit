package assignments.abstract_factory;

public class Main {
    public static void main(String[] args) {

        UIFactory factory = new AFactory();

        Button button = factory.createButton("Nappi");
        TextField textField = factory.createTextField("Testailen");
        Checkbox checkbox = factory.createCheckbox("Hyväksy");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("Button");
        textField.setText("Testing...");
        checkbox.setText("Accept");

        button.display();
        textField.display();
        checkbox.display();

    }
}
