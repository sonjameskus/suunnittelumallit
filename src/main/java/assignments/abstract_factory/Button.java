package assignments.abstract_factory;

abstract class Button extends UIElement {

    public Button(String text) {
        super(text);
    }

    public abstract void display();
}