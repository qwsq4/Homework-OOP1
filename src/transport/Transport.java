package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = checkNulity(brand);
        this.model = checkNulity(model);
        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else this.productionYear = 2000;
        this.productionCountry = checkNulity(productionCountry);
        this.color = checkNulity(color);
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else this.maxSpeed = 100;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = checkNulity(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else this.maxSpeed = 100;
    }

    public abstract void refill();

    public String checkNulity(String value) {
        if (value == null || value.equals("")) {
            value = "default";
        } return value;
    }
}
