public class JedliksToyCar {
    private int battery = 100; // cars start with full (100%) batteries
    private int distance;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String distanceToDisplay = "Driven " + distance + " meters";
        return distanceToDisplay;
    }

    public String batteryDisplay() {
        if (battery == 0)
            return "Battery empty";

        String batteryToDisplay = "Battery at " + battery + "%";
        return batteryToDisplay;
    }

    public void drive() {
        /* Each time you drive the car using the remote control, it covers 20 meters 
        and drains one percent of the battery */
        if (battery > 0) {
            // prevents increasing the distance and decreasing the battery when the battery is drained (at 0%)
            distance += 20;
            battery--;
        }
    }
}
