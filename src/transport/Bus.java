package transport;

public class Bus extends Car implements Competitor{
    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;
//    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }

    public Bus(String brand, String model, double engineVolume) {
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

//    @Override
//    public void refill() {
//        System.out.println("Заправка бензином на заправке.");
//    }

//    public void represent() {
//        System.out.println(getBrand() + " " + getModel() + ": год выпуска - " + getProductionYear() + ", страна выпуска - "
//        + getProductionCountry() + ", цвет - " + getColor() + ", скорость передвижения - " + getMaxSpeed() + " км/ч.");
//        refill();
//    }
}
