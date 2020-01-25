package Factory;

public class BlackColor extends ColorDecorator {
   public BlackColor (IColor newColor){
       super(newColor);
       System.out.println("Adding black");
   }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Black";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }
}
