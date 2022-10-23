package transport;

public abstract class Driver {

    public static class DriverB extends Driver {
        private LightVehicle car;

        public DriverB(String fullName, String driverLicense, int driverExperience, LightVehicle car) {
            super(fullName, driverLicense, driverExperience);
            this.car = car;
        }

        public LightVehicle getCar() {
            return car;
        }

        public void setCar(LightVehicle car) {
            this.car = car;
        }

        public void represent() {
            if (driverLicense.equals("есть")) {
                System.out.println("Водитель " + getFullName() + " управляет автомобилем " + getCar().getBrand() +
                        " " + getCar().getModel() + " и будет учавствовать в заезде.");
            } else System.out.println("Водитель " + getFullName() + " не имеет водительских прав и не может учавствовать в заезде");
        }
    }

    public static class DriverC extends Driver {
        private Truck car;

        public DriverC(String fullName, String driverLicense, int driverExperience, Truck car) {
            super(fullName, driverLicense, driverExperience);
            this.car = car;
        }

        public Truck getCar() {
            return car;
        }

        public void setCar(Truck car) {
            this.car = car;
        }

        public void represent() {
            if (driverLicense.equals("есть")) {
                System.out.println("Водитель " + getFullName() + " управляет автомобилем " + getCar().getBrand() +
                        " " + getCar().getModel() + " и будет учавствовать в заезде.");
            } else System.out.println("Водитель " + getFullName() + " не имеет водительских прав и не может учавствовать в заезде");
        }
    }

    public static class DriverD extends Driver {
        private Bus car;

        public DriverD(String fullName, String driverLicense, int driverExperience, Bus car) {
            super(fullName, driverLicense, driverExperience);
            this.car = car;
        }

        public Bus getCar() {
            return car;
        }

        public void setCar(Bus car) {
            this.car = car;
        }

        public void represent() {
            if (driverLicense.equals("есть")) {
                System.out.println("Водитель " + getFullName() + " управляет автомобилем " + getCar().getBrand() +
                        " " + getCar().getModel() + " и будет учавствовать в заезде.");
            } else System.out.println("Водитель " + getFullName() + " не имеет водительских прав и не может учавствовать в заезде");
        }
    }

    private final String fullName;
    String driverLicense;
    int driverExperience;

    public Driver(String fullName, String driverLicense, int driverExperience) {
        this.fullName = checkNulity(fullName, "! ФИО не указано !");
        if (driverLicense.equals("есть") || driverLicense.equals("нет")) {
            this.driverLicense = checkNulity(driverLicense, "нет");
        } else this.driverLicense = "нет";

        if (driverExperience < 0) {
            this.driverExperience = 1;
        } else this.driverExperience = driverExperience;
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

    public String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        }
        return value;
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
