package assignments.abstract_factory;

public class CheckboxA extends Checkbox {

    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("*~~~~~~*");
        System.out.println("{x} " + text);
        System.out.println("*~~~~~~*");
    }
}
