public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed < 5) {
            return (221 * speed);
        }
        else if (speed >= 5 && speed < 9) {
            return (221 * speed * 0.9); 
        }
        else if (speed == 9) {
            return (221 * speed * 0.8);
        }
        else if (speed == 10) {
            return (221 * speed * 0.77);
        }
        return 0;    // in case speed value is 0 or > 10
    }

    public int workingItemsPerMinute(int speed) {
        double workingItemsPerHour = productionRatePerHour(speed);
        return (int)(workingItemsPerHour / 60);
        
    }
}
