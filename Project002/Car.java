package Project002;

public class Car {
    /*Create a Class Car that would have the
    following fields: carPrice and color and method
    calculateSalePrice() which should be returning
    a price of the car.
            Create 2 subclasses: Sedan and Truck. The Truck
    class has a field as weight and has its own
            implementation of calculateSalePrice() method
    in which returned price is calculated as
    following: if weight>2000 then returned price
    car should include 10% discount, otherwise 20%
    discount.
    The Sedan class has field as length and also
            does it its own implementation of
            calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5%
    discount, otherwise 10% discount

     */
    double carPrice;
    String color;
    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    int length;
    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            System.out.println("Price of the Sedan after 5% discount : " + carPrice * 0.95);
        } else {
            System.out.println("Price of the Sedan after 10% discount : " + carPrice * 0.90);
        }
        return carPrice;
    }
}
class Truck extends Car{
    int weight;
    Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        if (weight>2000){
            System.out.println("Price of the Truck after 10% discount : "+carPrice * 0.90);
        }else {
            System.out.println("Price of the Truck after 20% discount : "+carPrice * 0.80);
        }
        return carPrice;
    }
}
class TestCar{
    public static void main(String[] args) {
        Car[] arr={new Sedan(32000,"Black",15),new Truck(40000,"Red",4000)};
        for (Car obj:arr){
            obj.calculateSalePrice();

        }
    }
}

