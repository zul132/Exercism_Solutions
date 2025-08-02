class NeedForSpeed {
    private int metersDriven; // zero meters initiallly
    private int batteryPercentage = 100;
    
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (batteryPercentage < batteryDrain) {
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            // Update the number of meters driven with the car's speed
            metersDriven += speed;
            // decrease the remaining battery percentage by the car's battery drain
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (distance > car.distanceDriven()) {
            if (car.batteryDrained()) {
                return false;   // Battery has drained before car finishes the Race
            }
            car.drive();
        }
        return true;
    }
}
