package Decorator;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Cheese");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + .80;
    }
}
