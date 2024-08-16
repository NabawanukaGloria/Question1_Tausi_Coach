/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
public class TrainStopCalculator {
   
    public static void main(String[] args) {
        // Distance from Kampala to Jinja in km
        int distance = 80;
        // Distance after which the train stops to offload/load passengers
        int stopDistance = 150;
        // Distance after which the train stops to refuel

        int refuelDistance = 200; 
        int passengerStops = distance / stopDistance;
        int refuelStops = distance / refuelDistance;

        int totalStops = passengerStops + refuelStops;

        System.out.println("Total number of stops: " + totalStops);
    }
}

    

