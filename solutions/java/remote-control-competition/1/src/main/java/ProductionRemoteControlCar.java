class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int numberOfVictories;

    public void drive() {
        // a ProductionRemoteControlCar drives 10 units
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar car) {
        // returns a positive integer if the current car has greater num of victories
        // returns a negative integer if the other car (argument) has greater num of victories
        return Integer.compare(this.numberOfVictories, car.getNumberOfVictories());
    }
}
