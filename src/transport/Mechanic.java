package transport;

import java.util.ArrayList;

public class Mechanic<T extends Car> {
    private String name;
    private String company;
    ArrayList<T> servicedCars = new ArrayList<>();

    public Mechanic(String name, String company) {
        this.name = checkNulity(name, "ФИО не указано");
        this.company = checkNulity(company, "Компания не указана");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<T> getServicedCars() {
        return servicedCars;
    }

    public void setServicedCars(T car) {
        servicedCars.add(car);
    }

    public void serviceCars() {
        for (T car : servicedCars) {
            car.serviceCar();
        }
    }

    public void repairCar() {
        for (T car : servicedCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + ": начинаю ремонт...");
            System.out.println("Ремонт завершен!");
        }
    }

    public static String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        } return value;
    }

    public static int checkZero(int value, int replace) {
        if (value > 0) {
            return value;
        } else return replace;
    }
}
