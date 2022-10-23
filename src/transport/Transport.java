package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
//    private final int productionYear;
//    private final String productionCountry;
//    private String color;
//    private int maxSpeed;

//    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        this.brand = checkNulity(brand);
//        this.model = checkNulity(model);
//       this.productionYear = checkZero(productionYear, 2000);
//       this.productionCountry = checkNulity(productionCountry);
//        this.color = checkNulity(color);
//       this.maxSpeed = checkZero(maxSpeed, 100);
//    }

    public Transport(String brand, String model) {
        this.brand = checkNulity(brand, "Бренд не указан");
        this.model = checkNulity(model, "Модель не указана");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

//    public int getProductionYear() {
//        return productionYear;
//    }

//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setColor(String color) {
//        this.color = checkNulity(color);
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed > 0) {
//            this.maxSpeed = maxSpeed;
//        } else this.maxSpeed = 100;
//    }

//    public abstract void refill();

    public String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        } return value;
    }

    int checkZero(int i, int r) {
        if (i > 0) {
            return i;
        } else return r;
    }
}
