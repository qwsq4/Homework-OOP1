package transport;

public class LightVehicle extends Car implements Competitor{
    public enum BodyType {
        SEDAN("Седан"),
        TYPE_HATCHBACK("Хетчбек"),
        TYPE_COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String btToStr;

        BodyType(String btToStr) {
            this.btToStr = btToStr;
        }

        public String getBtToStr() {
            return btToStr;
        }

        public static void identifyBodyType(BodyType i) {
            if (i != null) {
                System.out.println("Тип кузова - " + i.getBtToStr());
            } else System.out.println("Данных недостаточно");
        }
    }

    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;
    private BodyType bodyType;
    private Driver<LightVehicle> driver;
    private final String needCategory = "B";
    public LightVehicle(String brand, String model, double engineVolume) {
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getNeedCategory() {
        return needCategory;
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
        return true;
    }
}
