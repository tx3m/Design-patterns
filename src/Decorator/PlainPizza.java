package Decorator;

public class PlainPizza implements Pizza {
    /*Each pizza that we will later create, will be based on PlainPizza. Each different topping will have it's own class*/
    @Override
    public String getDescription() {
        return "Thin crust";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
