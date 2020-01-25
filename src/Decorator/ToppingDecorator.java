package Decorator;

abstract class ToppingDecorator implements Pizza{
    //implements Pizza so it has access to all the same methods in Pizza just as the PlainPizza does
    protected Pizza tempPizza; //holds our PlainPizza

    /*pass reference to the Pizza object, taht is going to be created. So we create an object, and then start adding changes
    to getDescription and getCost*/
    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    /*By implementing those functions, everything that will implement ToppingDecorator from now on will have access to those
    * functions for the pizza object tempPizza that we created in the beginning */
    @Override
    public String getDescription() {
        return tempPizza.getDescription()   ;
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
