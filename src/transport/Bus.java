package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправка бензином на заправке.");
    }

    public void represent() {
        System.out.println(getBrand() + " " + getModel() + ": год выпуска - " + getProductionYear() + ", страна выпуска - "
        + getProductionCountry() + ", цвет - " + getColor() + ", скорость передвижения - " + getMaxSpeed() + " км/ч.");
        refill();
    }
}
