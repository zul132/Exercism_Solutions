public class JedliksToyCar {
    private int batteryPercentage = 100; // cars start with full (100%) batteries
    private int distanceDriven; // initially zero meters

    // defining 20 meters and 1% (magic numbers) as named constants    
    private static final int DISTANCE_INCREMENT = 20;
    private static final int BATTERY_DRAIN = 1;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%"; 
    }

    public void drive() {
        /* Each time you drive the car using the remote control, it covers 20 meters 
        and drains one percent of the battery */
        if (batteryPercentage > 0) {
            // prevents increasing the distance and decreasing the battery when the battery is drained (at 0%)
            distanceDriven += DISTANCE_INCREMENT;
            batteryPercentage -= BATTERY_DRAIN;
        }
    }
}
