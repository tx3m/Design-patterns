package Factory;

public class CarFactory {

    public Cars createCar(String typeOfCar){

        switch(typeOfCar){
            case "Limo" : return new Limo();
            case "Sport Car" : return new SportCar();
            case "Truck" : return new Truck();
            default: return null;
        }
    }
}
