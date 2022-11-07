package transport;

import transport.*;

public class Driver<D extends Car & Competitor> {
    private final String fullName;
    String driverLicense;
    int driverExperience;
    private String category;
    D car;

    public Driver(String fullName, String driverLicense, int driverExperience, D car) {
        this.fullName = checkNulity(fullName, "! ФИО не указано !");
        if (driverLicense.equals("есть") || driverLicense.equals("нет")) {
            this.driverLicense = checkNulity(driverLicense, "нет");
        } else this.driverLicense = "нет";

        if (driverExperience < 0) {
            this.driverExperience = 1;
        } else this.driverExperience = driverExperience;

        this.car = car;
        this.car.setDriver(this);

        if (this.driverLicense.equals("есть")) {
            if (this.car.getClass().equals(LightVehicle.class)) {
                this.category = "B";
            }
            if (this.car.getClass().equals(Truck.class)) {
                this.category = "C";
            }
            if (this.car.getClass().equals(Bus.class)) {
                this.category = "D";
            }
        } else this.category = "нет";
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = checkNulity(driverLicense, "ФИО не указано");
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        if (driverExperience < 0) {
            this.driverExperience = 1;
        } else this.driverExperience = driverExperience;
    }

    public D getCar() {
        return car;
    }

    public void setCar(D car) {
            this.car = car;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category.toUpperCase();
        if (this.driverLicense.equals("нет")) {
            this.category = "нет";
        }else if (this.category.equals("B") || this.category.equals("C") || this.category.equals("D")) {
            this.category = category;
        } else this.category = "B";
    }

    public String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        }
        return value;
    }

    public void represent() {
        if (this.car == null) {
            System.out.println("Водитель не может учавствовать в заезде без машины");
        } else if (driverLicense.equals("есть")) {
            System.out.println("Водитель " + getFullName() + " управляет автомобилем " + getCar().getBrand() +
                    " " + getCar().getModel() + " и будет учавствовать в заезде.");
        } else System.out.println("Водитель " + getFullName() + " не имеет водительских прав и не может учавствовать в заезде");

    }

    public void startRide() {
        if (driverLicense.equals("есть")) {
            System.out.println("Завожу двигатель");
            System.out.println("Начинаю движение");
        } else System.out.println("Вы не можете водить машину без прав");
    }

    public void stopRide() {
        if (driverLicense.equals("есть")) {
            System.out.println("Жму на тормоз");
            System.out.println("Останавливаюсь");
        } else System.out.println("Вы не можете водить машину без прав");
    }

    public void refillCar() {
        if (driverLicense.equals("есть")) {
            stopRide();
            System.out.println("Заправляю машину");
        } else System.out.println("Вы не можете водить машину без прав");
    }
}
