package Factory;

public class SportCar extends Cars {

    public SportCar(){
        setName("Luigi");
        setBrand("Mazzeratti");
        setPrice(9876);
        setColor(new BasicColor());
    }
}
