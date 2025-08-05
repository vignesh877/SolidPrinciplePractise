/*
 * According to the Interface Segregation Principle (ISP),
 * no class should be forced to implement methods it does not use.
 *
 * If we define a single interface containing both rider and driver behaviors
 * (like bookRide, acceptRide, drive, endRide, payRide, etc.),
 * then classes like Rider will be forced to implement driver-related methods,
 * which they don't need — violating ISP.
 *
 * To solve this, we separate the responsibilities into smaller,
 * more specific interfaces such as RiderInterface and DriverInterface.
 *
 * This ensures that each class implements only the methods that are
 * relevant to its role, leading to cleaner and more maintainable code.
 */

interface riderInterFace{
    void bookRide();
    void payRide();
}

interface driverInterFace{
    void acceptRide();
    void endRide();
    void drive();
}



class Driver implements driverInterFace{
    public void acceptRide(){
        System.out.println("Ride accepted by driver");
    }
    public void endRide(){
        System.out.println("Ride ended by driver");
    }
    public void drive(){
        System.out.println("Ride initatied by driver");
    }
}


class Rider implements riderInterFace{
    public void bookRide(){
        System.out.println("Ride booked  by rider");
    }
    public void payRide(){
        System.out.println("Ride amount paid by rider");
    }
    public void cancleRide(){
        System.out.println("Ride was canceled by rider");
    }
}
public class Uber {
    public static void main(String args[]){
        Rider riderObj = new Rider();
        Driver driverObj = new Driver();
        riderObj.bookRide();
        driverObj.acceptRide();
        driverObj.drive();
        driverObj.endRide();
        riderObj.payRide();
    }
}
