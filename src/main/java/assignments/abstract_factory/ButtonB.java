package assignments.abstract_factory;

public class ButtonB extends Button {

    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println(" _______ ");
        System.out.println("[ " + text + " ]");
        System.out.println(" ------- ");
    }
}
