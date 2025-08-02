public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return (expectedMinutesInOven() - actualMinutesInOven);        
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noOfLayers) {
        return (noOfLayers * 2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noOfLayers, int actualMinutesInOven) {
        return (preparationTimeInMinutes(noOfLayers) + actualMinutesInOven);
    }
}
