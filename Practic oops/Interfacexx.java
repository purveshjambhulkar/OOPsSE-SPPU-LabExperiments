/*Interface
Design and develop a context for given case study 
and implement an interface for Vehicles 
Consider the example of vehicles like bicycle, car and bike.
 All Vehicles have common functionalities such as Gear Change,
  Speed up and apply breaks.
   Make an interface and put all these common functionalities
   . Bicycle, Bike, Car classes should be implemented for all these
    functionalities in their own class in their own way
 */

interface Vehicles {
   public void GearChange();

   public void SpeedUP();

   public void Applybreaks();
}

class Car implements Vehicles {
   int gear = 0;
   int speed = 20;

   public void GearChange() {
      gear++;
      System.out.println("Gear Changed");
      System.out.println("Gear : " + gear);
   }

   public void SpeedUP() {
      speed = speed + 5;
      System.out.println("Speed Increased");
      System.out.println("Speed : " + speed);
   }

   public void Applybreaks() {
      speed = speed - 5;
      System.out.println("Speed Decreased");
      System.out.println("Speed : " + speed);
   }

}

//Similarly Implement for Bike and Bicycle

public class Interfacexx {

   public static void main(String[] args) {
      Car car = new Car();
      car.GearChange();
      car.GearChange();
      car.SpeedUP();
      car.SpeedUP();
      car.Applybreaks();

   }

}