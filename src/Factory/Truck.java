package Factory;

public class Truck extends Cars{

    public Truck() {
        setName("Big Truck");
        setBrand("Mercedes");
        setPrice(1234);
        setColor(new BasicColor());
    }

}
