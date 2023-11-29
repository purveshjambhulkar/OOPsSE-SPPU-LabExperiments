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
interface Vehicles{
   
    public void GearChange();
    public void SpeedUP();
    public void ApplyBreaks();

}

class Bicycle implements Vehicles{

    int Gear ;
    double Speed ;

    Bicycle(double Speed ){
        this.Speed = Speed ;
        this.Gear = 0;
    }

    public void GearChange(){
            
    }

    public void SpeedUP(){
        System.out.println("Inceasing Speed By 5");
        Speed = Speed + 5 ;//Increases Speed by 5
        System.out.println("Speed : "+Speed);
    }

    public void ApplyBreaks(){
        System.out.println("Decreasing Speed By 5");
        Speed = Speed - 5 ;//Reduces Speed by 5
        System.out.println("Speed : "+Speed);
    }

}

class Car implements Vehicles{

    int Gear ;
    double Speed ;

    Car(int Gear , double Speed){
        this.Gear = Gear ;
        this.Speed = Speed;
    }

    public void GearChange(){
        System.out.println("Increasing Gear By 1");
        Gear = Gear+1 ;
        System.out.println("Gear : "+Gear);
    }

    public void SpeedUP(){
        System.out.println("Inceasing Speed By 5");
        Speed = Speed + 5 ;//Increases Speed by 5
        System.out.println("Speed : "+Speed);
    }

    public void ApplyBreaks(){
        System.out.println("Decreasing Speed By 5");
        Speed = Speed - 5 ;//Reduces Speed by 5
        System.out.println("Speed : "+Speed);
    }

}

class Bike implements Vehicles{

    int Gear ;
    double Speed ;

    Bike(int Gear ,double Speed){
        this.Gear = Gear ;
        this.Speed = Speed ;
    }

    public void GearChange(){
        System.out.println("Increasing Gear By 1");
        Gear = Gear+1 ;
        System.out.println("Gear : "+Gear);
    }

    public void SpeedUP(){
        System.out.println("Inceasing Speed By 5");
        Speed = Speed + 5 ;//Increases Speed by 5
        System.out.println("Speed : "+Speed);
    }

    public void ApplyBreaks(){
        System.out.println("Decreasing Speed By 5");
        Speed = Speed - 5 ;//Reduces Speed by 5
        System.out.println("Speed : "+Speed);
    }

}




public class Interface{
    
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle(12);
        bicycle.SpeedUP();
        bicycle.ApplyBreaks();
        System.out.println();

        Car car = new Car(1 , 23);
        car.GearChange();
        car.SpeedUP();
        car.ApplyBreaks();
        System.out.println();

        Bike bike = new Bike(1 , 23);
        bike.GearChange();
        bike.SpeedUP();
        bike.ApplyBreaks();
        System.out.println();




        
    }


}
