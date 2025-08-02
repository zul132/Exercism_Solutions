public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distance;

    public void drive() {
        // an ExperimentalRemoteControlCar drives 20 units
        distance += 20; 
    }

    public int getDistanceTravelled() {
        return distance;
    }
}
