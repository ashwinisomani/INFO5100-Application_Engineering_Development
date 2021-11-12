package MultiThread;

class TrafficLight {
    private boolean isAGreen = true; // set to true if A is greeen.

    public TrafficLight() {
    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized(this) {
            if ((roadId == 1 && !isAGreen) ||
                    (roadId == 2 && isAGreen)) {
                // The lights are green for the other road. Flip the light color.
                isAGreen = !isAGreen;
                turnGreen.run();
            }
            crossCar.run();
        }
    }
}