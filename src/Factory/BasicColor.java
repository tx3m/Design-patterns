package Factory;

public class BasicColor implements IColor{

    @Override
    public String getDescription() {
        return "Basic white";
    }

    @Override
    public double getCost() {
        return 1000;
    }
}
