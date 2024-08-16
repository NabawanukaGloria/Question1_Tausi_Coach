/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
public class ReturnJourney {
    public static void main(String[] args) {
        // Distance from Kabale to Kampala in km
        int distance = 10000;
        // Speed of the train in km/hr
        int speed = 250;
        // Distance after which the train stops to refuel
        int refuelDistance = 200; 
        // Time taken for each stop in minutes
        int stopTime = 5; 

        int refuelStops = distance / refuelDistance;
        
// Total stop time in minutes
        int totalStopTime = refuelStops * stopTime; 
// Travel time in hours
        double travelTime = (double) distance / speed; 
         // Total time in hours
        double totalTime = travelTime + (totalStopTime / 60.0);

        System.out.println("Total travel time for return journey: " + totalTime + " hours");
    }
}

    

