package Decorator;

public class PizzaMaker {
    public static void main(String[] args){
        //This will call all the different constructors that we want to use, for each ingredient of our Pizza
        Pizza myPizza = new Onions(new Olives(new Cheese(new Cheese(new Salami(new PlainPizza())))));

        System.out.println("Ingredients: " + myPizza.getDescription());
        System.out.println("Price: " + myPizza.getCost());
    }
}
