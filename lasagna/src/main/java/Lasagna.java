public class Lasagna {
    int EXPECTED_MINUTES_IN_OVEN = 40;
    int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minInOven) {
        return expectedMinutesInOven() - minInOven;
    }

    public int preparationTimeInMinutes(int numOfLayers) {
        return PREPARATION_TIME_PER_LAYER * numOfLayers;
    }

    public int totalTimeInMinutes(int numOfLayers, int minInOven) {
        return preparationTimeInMinutes(numOfLayers) + minInOven;
    }
}
