package transport;
import java.time.LocalDate;

public class Car extends Transport {
    public static class CarKey {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public CarKey(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart != null && !remoteEngineStart.equals("") && remoteEngineStart.equals("есть") ||
                    remoteEngineStart.equals("нет")) {
                this.remoteEngineStart = remoteEngineStart;
            } else this.remoteEngineStart = "нет";
            if (keylessAccess != null && !keylessAccess.equals("") && keylessAccess.equals("есть") ||
                    keylessAccess.equals("нет")) {
                this.keylessAccess = keylessAccess;
            } else this.keylessAccess = "нет";
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final int yearOfGetInsurance;
        private final int insuranceValidity;
        private final int insuranceCost;
        private final String insuranceNumber;

        public Insurance(int yearOfGetInsurance, int insuranceValidity, int insuranceCost, String insuranceNumber) {
            if (yearOfGetInsurance > 0) {
                this.yearOfGetInsurance = yearOfGetInsurance;
            } else this.yearOfGetInsurance = 2000;
            if (insuranceValidity > 0) {
                this.insuranceValidity = insuranceValidity;
            } else this.insuranceValidity = 1;
            if (insuranceCost > 0) {
                this.insuranceCost = insuranceCost;
            } else this.insuranceCost = 7000;
            if (insuranceNumber != null && !insuranceNumber.equals("")) {
                this.insuranceNumber = insuranceNumber;
            } else this.insuranceNumber = "default";
        }

        public int getYearOfGetInsurance() {
            return yearOfGetInsurance;
        }
        public int getInsuranceValidity() {
            return insuranceValidity;
        }
        public int getInsuranceCost() {
            return insuranceCost;
        }
        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void insuranceIsValid() {
            if (LocalDate.now().getYear() - yearOfGetInsurance > insuranceValidity) {
                System.out.println("Срок годности страховки закончился. Нужно оформить новую!");
            }
        }

        public void insuranceNumberIsValid() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    private double engineVolume;
    private String transmission;
    private final String typeOfFrame;
    private String licensePlateNumber;
    private final int seatsCount;
    private String typeOfTyre;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission,String typeOfFrame, String licensePlateNumber,
               int seatsCount, String typeOfTyre, Insurance insurance, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5;

        if (seatsCount != 0) {
            this.seatsCount = seatsCount;
        } else this.seatsCount = 4;

        if (typeOfTyre == "Летняя" || typeOfTyre == "Зимняя") {
            this.typeOfTyre = typeOfTyre;
        } else this.typeOfTyre = "Летняя";

        this.transmission = checkNulity(transmission);
        this.typeOfFrame = checkNulity(typeOfFrame);
        this.licensePlateNumber = checkNulity(licensePlateNumber);
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getTypeOfFrame() {
        return typeOfFrame;
    }
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }
    public String getTypeOfTyre() {
        return typeOfTyre;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setTransmission(String transmission) {
        this.transmission = checkNulity(transmission);
    }
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = checkNulity(licensePlateNumber);
    }
    public void setTypeOfTyre(String typeOfTyre) {
        this.typeOfTyre = checkNulity(typeOfTyre);
    }

    public void represent() {
        System.out.println(getBrand() + " " + getModel() + ", год выпуска - " + getProductionYear() +  ", страна " +
                "сборки - " + getProductionCountry() + ", цвет - " + getColor() + ", объем двигателя - " +
                this.engineVolume + " л, коробка передач - " + this.transmission + ", тип кузова - " + this.typeOfFrame
                + ", максимальная скорость - " + getMaxSpeed() + ", регистрационный номер - " +
                this.licensePlateNumber + ", кол-во мест - " + this.seatsCount + ", " +
                "тип резины - " + this.typeOfTyre + ". Страховка: срок действия страховки - " +
                this.insurance.insuranceValidity + " год(лет), стоимость - " + this.insurance.insuranceCost + " руб., " +
                "номер -" + this.insurance.insuranceNumber + ".");
        refill();
    }

    @Override
    public void refill() {
        System.out.println("Заправка бензином на заправке.");
    }

    public void replaceTypeOfTyre() {
        if (this.typeOfTyre.equals("Летняя")) {
            this.typeOfTyre = "Зимняя";
        } else this.typeOfTyre = "Летняя";
    }

    public boolean isLicensePlateNumberCorrect() {
        if (licensePlateNumber.length() != 9) {
            return false;
        }
        char[] chars = licensePlateNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
}
