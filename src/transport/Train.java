package transport;

public class Train extends Transport{
    int rideCost;
    private int rideTime;
    private String initialStation;
    private String finalStation;
    private int wagonsNumber;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 int rideCost, int rideTime, String initialStation, String finalStation, int wagonsNumber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (rideCost > 0) {
            this.rideCost = rideCost;
        } else this.rideCost = 3000;
        if (rideTime > 0) {
            this.rideTime = rideTime;
        } else this.rideTime = 5;
        this.initialStation = checkNulity(initialStation);
        this.finalStation = checkNulity(finalStation);
        if (wagonsNumber > 0) {
            this.wagonsNumber = wagonsNumber;
        } else this.wagonsNumber = 15;
    }

    public int getRideCost() {
        return rideCost;
    }

    public int getRideTime() {
        return rideTime;
    }

    public String getInitialStation() {
        return initialStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public void setRideCost(int rideCost) {
        this.rideCost = rideCost;
    }

    public void setRideTime(int rideTime) {
        this.rideTime = rideTime;
    }

    public void setInitialStation(String initialStation) {
        this.initialStation = initialStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public void setWagonsNumber(int wagonsNumber) {
        this.wagonsNumber = wagonsNumber;
    }

    public void represent() {
        System.out.println(getBrand() + " " + getModel() + ": год выпуска - " + getProductionYear() + ", страна выпуска " +
                "- " + getProductionCountry() + ", скорость передвижения - " + getMaxSpeed() + " км/ч. Начальная станция - " +
                initialStation + ", конечная станция - " + finalStation + ", стоимость билета - " + rideCost + " руб, " +
                "время поездки - " + rideTime + ", кол-во вагонов - " + wagonsNumber + ".");
        refill();
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизельным топливом на заправочной станции.");
    }
}
