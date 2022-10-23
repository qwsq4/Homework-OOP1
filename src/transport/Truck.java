package transport;

public class Truck extends Car implements Competitor{
    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public double getPitStop() {
        return pitStop;
    }

    public void setPitStop(double pitStop) {
        this.pitStop = pitStop;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        this.bestLapTime = bestLapTime;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void pitStop() {
        if (Double.compare(pitStop, 0) > 0) {
            System.out.println(getBrand() + " " + getModel() + ": пит-стоп длился " + pitStop + " сек.");
        } else System.out.println(getBrand() + " " + getModel() + ": машина пока не учавствовала в заездах");
    }

    @Override
    public void bestLapTime() {
        if (Double.compare(bestLapTime, 0) > 0) {
            System.out.println(getBrand() + " " + getModel() + ": лучшее время круга - " + bestLapTime + " сек.");
        } else System.out.println(getBrand() + " " + getModel() + ": машина пока не учавствовала в заездах");
    }

    @Override
    public void maxSpeed() {
        if (Double.compare(maxSpeed, 0) > 0) {
            System.out.println(getBrand() + " " + getModel() + ": максимальная скорость - " + maxSpeed + " км/ч.");
        } else System.out.println(getBrand() + " " + getModel() + ": машина пока не учавствовала в заездах");
    }
}
