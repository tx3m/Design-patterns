package Factory;

public class GoldColor extends ColorDecorator{


    public GoldColor(IColor newColor) {
        super(newColor);
        System.out.println("Adding some golden paint!");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Golden";
    }

    @Override
    public double getCost() {
        return super.getCost() + 700;
    }
}
