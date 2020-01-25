package Decorator;

public class Salami extends ToppingDecorator {
    public Salami(Pizza newPizza) {//thats a refference back to PlainPizza
        super(newPizza); //The ToppingDecorator will be super as thats the class we are extending to
        System.out.println("Adding Dough");
        System.out.println("Adding Salami");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Salami";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
