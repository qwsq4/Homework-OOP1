package transport;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Car extends Transport {
    public static class Sponsor{
    private String name;
    private int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = checkNulity(name, "Информация не указана");
        this.supportAmount = checkZero(supportAmount, 10000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkNulity(name, "Информация не указана");
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = checkZero(supportAmount, 10000);
    }

    public void sponsorRace(Car... cars) {
        for (Car car : cars) {
            car.getSponsorsList().add(this);
        }
    }
}

//    public static class CarKey {
//        private final String remoteEngineStart;
//        private final String keylessAccess;
//
//        public CarKey(String remoteEngineStart, String keylessAccess) {
//            this.remoteEngineStart = checkNulity(remoteEngineStart);
//            this.keylessAccess = checkNulity(keylessAccess);
//        }
//
//        public String getRemoteEngineStart() {
//            return remoteEngineStart;
//        }
//        public String getKeylessAccess() {
//            return keylessAccess;
//        }
//
//        public String checkNulity(String string) {
//            if (string != null && !string.equals("") && string.equals("есть") ||
//                    string.equals("нет")) {
//                return string;
//            }  else return "нет";
//        }
//    }
//
//    public static class Insurance {
//        private final int yearOfGetInsurance;
//        private final int insuranceValidity;
//        private final int insuranceCost;
//        private final String insuranceNumber;
//
//        public Insurance(int yearOfGetInsurance, int insuranceValidity, int insuranceCost, String insuranceNumber) {
//            this.yearOfGetInsurance = checkZero(yearOfGetInsurance, 2000);
//            this.insuranceValidity = checkZero(insuranceValidity, 1);
//            this.insuranceCost = checkZero(insuranceCost, 3000);
//            this.insuranceNumber = checkNulity(insuranceNumber);
//        }
//
//        public int getYearOfGetInsurance() {
//            return yearOfGetInsurance;
//        }
//        public int getInsuranceValidity() {
//            return insuranceValidity;
//        }
//        public int getInsuranceCost() {
//            return insuranceCost;
//        }
//        public String getInsuranceNumber() {
//            return insuranceNumber;
//        }
//
//        public void insuranceIsValid() {
//            if (LocalDate.now().getYear() - yearOfGetInsurance > insuranceValidity) {
//                System.out.println("Срок годности страховки закончился. Нужно оформить новую!");
//            }
//        }

    //        public void insuranceNumberIsValid() {
//            if (insuranceNumber.length() != 9) {
//                System.out.println("Номер страховки некорректный!");
//            }
//        }
//
//        public String checkNulity(String value) {
//            if (value == null || value.equals("")) {
//                value = "default";
//            } return value;
//        }
//
//        int checkZero(int i, int r) {
//            if (i > 0) {
//                return i;
//            } else return r;
//        }
//    }
//

    private double engineVolume;
    private String needCategory;
    private Driver<?> driver;
    private Set<Sponsor> sponsorsList = new HashSet<>();
    static Set<Car> allCompetitorCars = new HashSet<>();
    private Set<Mechanic> mechanicsList = new HashSet<>();
//    private String transmission;
//    private final String typeOfFrame;
//    private String licensePlateNumber;
//    private final int seatsCount;
//    private String typeOfTyre;
//    private Insurance insurance;
//
//    public Car(String brand, String model, double engineVolume, String color, int productionYear,
//               String productionCountry, String transmission,String typeOfFrame, String licensePlateNumber,
//               int seatsCount, String typeOfTyre, Insurance insurance, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//
//        if (Double.compare(engineVolume, 0) != 0) {
//            this.engineVolume = engineVolume;
//        } else this.engineVolume = 1.5;
//
//            this.seatsCount = checkZero(seatsCount, 4);
//
//        if (typeOfTyre == "Летняя" || typeOfTyre == "Зимняя") {
//            this.typeOfTyre = typeOfTyre;
//        } else this.typeOfTyre = "Летняя";
//
//        this.transmission = checkNulity(transmission);
//        this.typeOfFrame = checkNulity(typeOfFrame);
//        this.licensePlateNumber = checkNulity(licensePlateNumber);
//        this.insurance = insurance;
//    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model);
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getNeedCategory() {
        return needCategory;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    void setDriver(Driver<?> driver) {
        this.driver = driver;
    }

    public Set<Sponsor> getSponsorsList() {
        return sponsorsList;
    }

    public void setSponsorsList(Sponsor... sponsors) {
        for (Sponsor sponsor : sponsors) {
            sponsorsList.add(sponsor);
        }
    }

    public Set<Mechanic> getMechanicsList() {
        return mechanicsList;
    }

    public void setMechanicsList(Mechanic... mechanics) {
        for (Mechanic mechanic : mechanics) {
            mechanicsList.add(mechanic);
            mechanic.setServicedCars(this);
        }
    }

    public static void getAllCompetitorCars() {
        System.out.println("Все автомобили учавствующие в забеге");
        for (Car car : allCompetitorCars) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }

    //    public String getTransmission() {
//        return transmission;
//    }
//    public String getTypeOfFrame() {
//        return typeOfFrame;
//    }
//    public String getLicensePlateNumber() {
//        return licensePlateNumber;
//    }
//    public String getTypeOfTyre() {
//        return typeOfTyre;
//    }
//
//    public int getSeatsCount() {
//        return seatsCount;
//    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5;
    }
//    public void setTransmission(String transmission) {
//        this.transmission = checkNulity(transmission);
//    }
//    public void setLicensePlateNumber(String licensePlateNumber) {
//        this.licensePlateNumber = checkNulity(licensePlateNumber);
//    }
//    public void setTypeOfTyre(String typeOfTyre) {
//        this.typeOfTyre = checkNulity(typeOfTyre);
//}

//    public void represent() {
//        System.out.println(getBrand() + " " + getModel() + ", год выпуска - " + getProductionYear() +  ", страна " +
//                "сборки - " + getProductionCountry() + ", цвет - " + getColor() + ", объем двигателя - " +
//                this.engineVolume + " л, коробка передач - " + this.transmission + ", тип кузова - " + this.typeOfFrame
//                + ", максимальная скорость - " + getMaxSpeed() + " км/ч, регистрационный номер - " +
//                this.licensePlateNumber + ", кол-во мест - " + this.seatsCount + ", " +
//                "тип резины - " + this.typeOfTyre + ". Страховка: срок действия страховки - " +
//                this.insurance.insuranceValidity + " год(лет), стоимость - " + this.insurance.insuranceCost + " руб., " +
//                "номер -" + this.insurance.insuranceNumber + ".");
//        refill();
//    }

//    @Override
//    public void refill() {
//        System.out.println("Заправка бензином на заправке.");
//    }

    public static void startRide() {
        System.out.println("Завожу мотор");
        System.out.println("Начинаю движение");
    }

    public abstract boolean needDiagnostics();

    public void showSponsors() {
        System.out.println("  Автомобиль: " + getBrand() + " " + getModel() + ", спонсоры: ");
        for (Sponsor sponsor : sponsorsList) {
            System.out.println(sponsor.getName() + ", сумма поддержки - " +
                    sponsor.getSupportAmount() + " руб.");
        }
    }

    private void service() {;
        if (this.driver != null) {
            if (!getDriver().getCategory().equals(this.getNeedCategory()) || getDriver().getCategory().equals("нет")) {
                throw new RuntimeException("Водитель " + getDriver().getFullName() + ": категория прав не указана или не соответствует необходимой для данного транспорта");
            } else if (this.needDiagnostics()) {
                System.out.println(this.getBrand() + " " + this.getModel() + ": выполняю диагностику");
                System.out.println(this.getBrand() + " " + this.getModel() + ": диагностика завершена");
                System.out.println();
            } else {
                System.out.println(this.getBrand() + " " + this.getModel() + ": данный вид транспорта в диагностике не нуждается");
                System.out.println();
            }
        } else throw new RuntimeException("Водитель не найден");
    }

    public void serviceCar() {
        try {
            service();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

    private Driver checkDriver(Driver<?> driver) {
        if (this != driver.getCar()) {
            return null;
        }
        return driver;
    }

    public void represent() {
        System.out.print("  " + getBrand() + " " + getModel() + ": водитель - " + getDriver().getFullName() + ". Cпонсоры: ");
        for (Sponsor sponsor : sponsorsList) {
                System.out.println(sponsor.getName());
            }
        System.out.println("  Механики");
        for (Mechanic mechanic : mechanicsList) {
                System.out.print(mechanic.getName());
            }
        System.out.println();
    }

//    public void replaceTypeOfTyre() {
//        if (this.typeOfTyre.equals("Летняя")) {
//            this.typeOfTyre = "Зимняя";
//        } else this.typeOfTyre = "Летняя";
//    }

    //    public boolean isLicensePlateNumberCorrect() {
//        if (licensePlateNumber.length() != 9) {
//            return false;
//        }
//        char[] chars = licensePlateNumber.toCharArray();
//        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
//            return false;
//        }
//        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
//                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
//            return false;
//        }
//        return true;
//    }
}
