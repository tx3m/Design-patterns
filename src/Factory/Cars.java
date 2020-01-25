package Factory;

public abstract class Cars {

    private double price;
    private String name;
    private String brand;
    private IColor color;

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice(){
        return price + color.getCost();
    };
    public String getName(){
        return name;
    };
    String getBrand(){
        return brand;
    };
}
