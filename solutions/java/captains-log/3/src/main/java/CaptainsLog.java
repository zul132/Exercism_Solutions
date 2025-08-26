import java.util.Random;
/*   
    Captain's Log
    Mary is a big fan of the TV series Star Trek: The Next Generation. She often plays pen-and-paper role playing games, where she and her friends pretend to be the crew of the Starship Enterprise. Mary's character is Captain Picard, which means she has to keep the captain's log. She loves the creative part of the game, but doesn't like to generate random data on the spot.
    Help Mary by creating random generators for data commonly appearing in the captain's log.
*/

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    /* 
        Task 1: Generate a random planet
    */
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    /*
        Task 2: Generate a random starship registry number
    */
    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }

    /* 
        Task 3: Generate a random stardate
    */
    double randomStardate() {
        return 41000.0 + 1000.0 * random.nextDouble();
    }
}
