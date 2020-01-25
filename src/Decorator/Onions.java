package Decorator;

public class Onions extends ToppingDecorator {
    public Onions(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Onions");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onions";
    }

    @Override
    public double getCost() {
        return super.getCost() + .30;
    }
}
