package Decorator;

public class Olives extends ToppingDecorator{
    public Olives(Pizza newPizza) {//thats a refference back to PlainPizza
        super(newPizza); //The ToppingDecorator will be super as thats the class we are extending to
        System.out.println("Adding Olives");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
