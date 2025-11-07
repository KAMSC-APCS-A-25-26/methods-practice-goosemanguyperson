import java.text.DecimalFormat;
import java.util.Scanner;


public class TripPlanner {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallpon
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter travel distance: ");
        double distance = sc.nextDouble();
        System.out.print("Enter average speed: ");
        double speed = sc.nextDouble();
        System.out.print("Ender fuel efficiency (miles per gallon): ");
        double fuelEfficiency = sc.nextDouble();
        System.out.print("Enter fuel price per gallon:");
        double fuelPrice = sc.nextDouble();
        
        // TODO: Calculate travel time using a return method
        double travelTime = calculateTravelTime(distance, speed);
        // TODO: Calculate fuel needed using a return method
        double fuelNeeded = calculateFuelNeeded(distance, fuelEfficiency);
        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(fuelNeeded, fuelPrice);
        // TODO: Display results using a void method
        displayResults(travelTime, fuelNeeded, tripCost);

        sc.close();
    }
    
    // TODO: Implement calculateTravelTime method
    public static double calculateTravelTime(double distance, double speed) {
        if (speed != 0) {
        return distance / speed;
        } else {
            System.out.println("Well, you aren't moving.");
            return 0;
        }
    }

    // TODO: Implement calculateFuelNeeded method
    public static double calculateFuelNeeded(double distance, double efficiency){
        if(efficiency!=0){
            return distance / efficiency;
        } else{
            System.out.println("Well, your fuel tank seems to be leaking.");
            return 0;
        }
    }

    // TODO: Implement calculateTripCost method
    public static double calculateTripCost(double fuelNeeded, double fuelCost){
        return fuelNeeded*fuelCost;
    }
    // TODO: Implement displayResults method
    public static void displayResults(double travelTime, double fuelNeeded, double tripCost){
        System.out.println("Travel Time: " + df.format(travelTime) + " hours");
        System.out.println("Fuel Needed: " + df.format(fuelNeeded) + " gallons");
        System.out.println("Trip Cost: $" + df.format(tripCost));
    }
}
