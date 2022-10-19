public class car {
    String brand = "default";
    String model = "default";
    double engineVolume = 1.5;
    String color = "белый";
    int productionYear = 2000;
    String productionCountry = "default";

    car() {
    }

    car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    car(String brand, String model, double engineVolume, String color, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
    }

    car(String brand, String model, double engineVolume, String color) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    car(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    car(String brand) {
        this.brand = brand;
    }
}
