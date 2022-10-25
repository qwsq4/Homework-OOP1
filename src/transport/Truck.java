package transport;

public class Truck extends Car implements Competitor{
    public enum LoadCapacityType {
        N1(0D, 3.5, "N1"),
        N2(3.5, 12D, "N2"),
        N3(12D, 1000000, "N3");

        private final double from;
        private final double to;
        private final String capToStr;

        LoadCapacityType(double from, double to, String capToStr) {
            this.from = from;
            this.to = to;
            this.capToStr = capToStr;
        }

        public double getFrom() {
            return from;
        }

        public double getTo() {
            return to;
        }

        public String getCapToStr() {
            return capToStr;
        }

        public static void identifyCapacityType(double i) {
            String name = null;
            for (Truck.LoadCapacityType value : values()) {
                if (i > value.getFrom() && i <= value.getTo()) {
                    name = value.getCapToStr();
                }
            }
            if (name != null) {
                System.out.println("Грузоподъмость грузовик - " + name);
            } else System.out.println("Данных недостаточно");
        }
    }
    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;
    private double capacityNumber;
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

    public double getCapacityNumber() {
        return capacityNumber;
    }

    public void setCapacityNumber(double capacityNumber) {
        this.capacityNumber = capacityNumber;
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
