public class Rocket {
     String country;
     double speed;
     double fuelCapacity;
     int noOfThrusters;

    public void details() {
        System.out.println("Rocket Country: " + country);
        System.out.println("Rocket Speed: " + speed + " km/h");
        System.out.println("Rocket Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Number of Thrusters: " + noOfThrusters);
        System.out.println("=======================================");
    }

    public Rocket() {
        this.country = "Unknown";
        this.speed = 0.0;
        this.fuelCapacity = 0.0;
        this.noOfThrusters = 0;
    }

    public Rocket(String country) {
        this.country = country;

    }

    
    public void setSpeed( double speed) {
        this.speed = speed;

    }

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket("Us");
        rocket1.speed = 5000;
        rocket1.fuelCapacity = 15000;
        rocket1.noOfThrusters = 4;
        rocket1.details();

        
        Rocket rocket2 = new Rocket("Uk");
		rocket2.setSpeed(400);
		rocket1.fuelCapacity = 1000;
        rocket2.details();

        Rocket rocket3 = new Rocket("japan");
        rocket3.setSpeed (6000);
        rocket3.fuelCapacity = 30000;
        rocket3.noOfThrusters = 8;
        rocket3.details();

        Rocket rocket4 = new Rocket();
        rocket4.setSpeed( 60);
		rocket1.fuelCapacity = 5000;
        rocket4.details();
    }
}
