/**
 * Abstract class 
 * 
 * To allow to create UberRide, or TaxifyRide, BoltRide
 * 
 */
    // I understand how interfaces and abstract classes work
public abstract class Ride {

    //variables
    String startingPoint;
    String endingPoint;

    //methods that can be overriden
    public abstract double calculateDistance(String startingPoint, String endingPoint);
    public abstract Driver assignDriver();
    public abstract double calculateCost(String startingPoint, String endingPoint);
    public abstract void completePayment(Driver driver, Passenger passenger);

 }