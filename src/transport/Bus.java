package transport;

public class Bus extends Car implements Competitor{
    public enum CapacityType {
        VERY_LOW(0, 10, "особо малая"),
        LOW(10, 25, "малая"),
        MIDDLE(25,50, "средняя"),
        HIGH(50, 80, "большая"),
        VERY_HIGH(80, 120, "особо большая");

        private final int from;
        private final int to;
        private final String capToStr;

        CapacityType(int from, int to, String capToStr) {
            this.from = from;
            this.to = to;
            this.capToStr = capToStr;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        public String getCapToStr() {
            return capToStr;
        }

        public static void identifyCapacityType(int i) {
            String name = null;
            for (CapacityType value : values()) {
                if (i > value.getFrom() && i <= value.getTo()) {
                    name = value.getCapToStr();
                }
            }
            if (name != null) {
                System.out.println("Вместимость автобуса - " + name);
            } else System.out.println("Данных недостаточно");
        }
    }
    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;
    private int capacityNumber;
    private final String needCategory = "D";
    private Driver<Bus> driver;
//    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        allCompetitorCars.add(this);
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

    public String getNeedCategory() {
        return needCategory;
    }

    public int getCapacityNumber() {
        return capacityNumber;
    }

    public void setCapacityNumber(int capacityNumber) {
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

    @Override
    public boolean needDiagnostics() {
        return false;
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
