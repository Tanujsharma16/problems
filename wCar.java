public class wCar {
   String brand;
   int speed;
   public Car(String brand, int speed) {
       this.brand = brand;
       this.speed = speed;
   } 
   public static void main(String[] args) {
    int wheelCount = 4;
    Car car = new Car("Toyota", 120);
    System.out.println("Car brand: " + car.brand);
    System.out.println("Car speed: " + car.speed + " km/h");
    System.out.println("Number of wheels: " + wheelCount);
}
}
