/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GLORIA
 */
   import java.time.LocalTime;
import java.time.Duration;
public class ArrivalTime {
 
    public static void main(String[] args) {
        // Speed in m/s
        double speed = 225.5;
        // Distance from Kabale to Kampala in meters
        int distance = 10000 * 1000; 
         // Start time at 09:00 hrs
        LocalTime startTime = LocalTime.of(9, 0);
// Travel time in seconds
        double travelTimeSeconds = distance / speed; 
        Duration travelDuration = Duration.ofSeconds((long) travelTimeSeconds);

        LocalTime arrivalTime = startTime.plus(travelDuration);

        System.out.println("Approximate arrival time: " + arrivalTime);
    }
}

    

