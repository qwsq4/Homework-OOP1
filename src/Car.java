public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand != null && model != null && color != null && productionCountry != null) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.productionCountry = productionCountry;
        } else {
            this.brand = "default";
            this.model = "default";
            this.color = "белый";
            this.productionCountry = "default";
        }

        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (productionYear != 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
    }

    public void represent() {
        System.out.println(this.brand + " " + this.model + ", год выпуска - " + this.productionYear +  ", страна сборки - " + this.productionCountry + ", цвет - " + this.color + ", объем двигателя - " + this.engineVolume + " л.");
    }
}
