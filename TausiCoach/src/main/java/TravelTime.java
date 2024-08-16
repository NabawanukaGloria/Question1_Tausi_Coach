/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
public class TravelTime {
    public static void main(String[] args) {
        // Distance from Kampala to Kabale in km
        int distance = 10000; 
       // Speed of the train in km/hr
        int speed = 250;
         // Distance after which the train stops to offload/load passengers
        int stopDistance = 150;
        // Distance after which the train stops to refuel
        int refuelDistance = 200;
         // Time taken for each stop in minutes
        int stopTime = 5;

        int passengerStops = distance / stopDistance;
        int refuelStops = distance / refuelDistance;

        int totalStops = passengerStops + refuelStops;
         // Total stop time in minutes
        int totalStopTime = totalStops * stopTime;
        
// Travel time in hours
        double travelTime = (double) distance / speed; 
         // Total time in hours
        double totalTime = travelTime + (totalStopTime / 60.0);

        System.out.println("Total travel time: " + totalTime + " hours");
    }
}

    

