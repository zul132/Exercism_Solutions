public class CarsAssemble {
    // define a constant to store the the rate of cars produced per hour at speed 1
    private final int BASE_PRODUCTION_RATE = 221;

    private double getSuccessRate(int speed) {
        if (speed == 10) {
            return 0.77; // 77% success
        }
        if (speed == 9) {
            return 0.8; // 80% success
        }
        if (speed >= 5) { // Covers 5, 6, 7, 8
            return 0.9; // 90% success
        }
        // If none of the above, it must be 1-4. 
        // To handle speed 0 also, it's 1.0 for no production
        return 1.0; // 100% success
    }

    public double productionRatePerHour(int speed) {
        return BASE_PRODUCTION_RATE * speed * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);   
    }
}
