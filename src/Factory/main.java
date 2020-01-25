package Factory;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();
        Cars car1, car2, car3;
        int index = 1;
        ArrayList<Cars> carsList = new ArrayList<>();

        IColor newColor = new BlackColor(new GoldColor(new BasicColor()));

        car1 = carFactory.createCar("Truck");
        car2 = carFactory.createCar("Sport Car");
        car3 = carFactory.createCar("Limo");

        car1.setColor(newColor);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);

        for (Cars car: carsList) {
            System.out.println("Car " + index + " is "+ car.getName() + ", the brand is " + car.getBrand()+ " and it costs "+ car.getPrice());
            index++;
        }
        System.out.println("Car 1 is "+ car1.getName() + ", the brand is " + car1.getBrand()+ ", it costs "
                + car1.getPrice() + " and the color is: " + car1.getColor().getDescription());
    }
}
