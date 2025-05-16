public class CarsAssemble {

    public final int CAR_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double numOfCars = (double) CAR_PER_HOUR * speed;
        if (speed >= 1 && speed <= 4) {
            return numOfCars;
        } else if (speed >= 5 && speed <= 8) {
            return numOfCars * 0.9;
        } else if (speed == 9) {
            return numOfCars * 0.8;
        } else {
            return numOfCars * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = productionRatePerHour(speed);
        return (int) carsPerHour / 60;
    }
}
