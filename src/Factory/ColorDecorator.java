package Factory;

public abstract class ColorDecorator implements IColor{

    private IColor tempColor;

    public ColorDecorator (IColor newColor){
        tempColor = newColor;
    }

    @Override
    public String getDescription() {
        return tempColor.getDescription();
    }

    @Override
    public double getCost() {
        return tempColor.getCost();
    }
}
