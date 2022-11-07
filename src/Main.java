import Cooking.ProductList;
import Cooking.Recipe;
import transport.*;
import transport.Driver;

import java.util.*;

public class Main {

    public static class Task {
        private int x;
        private int y;

        public Task(int x, int y) {
                setX(x);
                setY(y);
        }
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " * " + y + " =";
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || o.getClass() != this.getClass()) {
                return false;
            }
            if (hashCode() != o.hashCode()) {
                return false;
            }
            Task i = (Task) o;
            return (i.getX() == this.x && i.getY() == this.y)
                    || (i.getX() == this.y && i.getY() == this.x);
        }

        @Override
        public int hashCode() {
            return (x + y) * x * y * 31;
        }
    }

    public static class TaskList { 
        private static final Set<Task> taskList = new HashSet<>(15);

        public TaskList() {
            while (taskList.size() < 15) {
                int x = new Random().ints(1, 10).findFirst().getAsInt();
                int y = new Random().ints(1, 10).findFirst().getAsInt();
                Task t = new Task(x, y);
                addTask(t);
            }
        }

        private void addTask(Task task) {
            taskList.add(task);
        }

        public void getTaskList() {
            System.out.println("Список задач:");
            for (Task task : taskList) {
                System.out.println(task.toString());
            }
        }
    }
//    public static void bouquetCalculate(Flower[] flower){
//            double bouquetCost = 0;
//            for (Flower value : flower) {
//                    bouquetCost = bouquetCost + value.getCost();
//            }
//            bouquetCost = bouquetCost + bouquetCost / 100 * 10;
//
//            int bouquetLifeSpan = 1000000;
//            for (Flower value : flower) {
//                    if (bouquetLifeSpan > value.lifeSpan) {
//                            bouquetLifeSpan = value.lifeSpan;
//                    }
//            }
//
//            String bouquetComposition = flower[0].getName();
//            for (int i = 1; i < flower.length; i++) {
//                    bouquetComposition = bouquetComposition + ", " + flower[i].getName();
//            }
//
//        System.out.println ("Состав букета - " + bouquetComposition + ". Стоимость букета - " + String.format("%.2f", bouquetCost) + " руб., срок стояния - " + bouquetLifeSpan + " дней");
//    }

        public static void checkService(Car... cars) {
                for (Car car : cars) {
                        car.serviceCar();
                }
    }

    public static void main(String[] args){
//            Human maxim = new Human(1987, "Максим", "Минск", "Бренд-менеджер");
//            maxim.represent();
//            Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
//            anya.represent();
//            Human katya = new Human(1994, "Катя", "Калинград", "Продакт-менеджер");
//            katya.represent();
//            Human artyom = new Human(1995, "Артём", "Москва", "Директор по развитию бизнеса");
//            artyom.represent();
//            Human vladimir = new Human(2001, "Владимир", "Казань", "");
//            vladimir.represent();
//
//            System.out.println();

//            Car.Insurance insurance = new Car.Insurance(2020, 1, 9000, "9ПА46ВФ75");
//            Car.Insurance insurance1 = new Car.Insurance(2015, 2, 20000, "942АЦУ544");
//            Car.Insurance insurance2 = new Car.Insurance(2019, 1, 11000, "ЩЦВ9415АА");
//            Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "Универсал", "Н826ГО658", 4, "Зимняя", insurance, 200);
//            ladaGranta.represent();
//
//            Car audiA8 = new Car("Audi", "A8 50l TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "Седан", "Н53ОН732", 4, "Летняя", insurance2, 300);
//            audiA8.represent();
//
//            Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "Седан", "Ш721МИ235", 2, "Зимняя", insurance, 250);
//            bmwZ8.represent();
//
//            Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механика", "Седан", "Г342ГИ431", 4, "Зимняя", insurance1, 240);
//            kiaSportage4.represent();
//
//            Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "Универсал", "С342ОЛ697", 4, "Летняя", insurance2, 260);
//            hyundaiAvante.represent();

//            System.out.println();

//            Flower rose = new Flower("Роза обыкновенная", "красный", "Голландия", 35.59, 0);
//            rose.represent();
//            Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
//            chrysanthemum.represent();
//            Flower peony = new Flower("Пион", "", "Англия", 69.9, 1);
//            peony.represent();
//            Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
//            gypsophila.represent();
//
//            System.out.println();
//
//            Flower[] bouquet = {rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila};
//            bouquetCalculate(bouquet);
//
//            System.out.println();

//            Train lastochka = new Train("Ласточка", "BD-901", 2011, "Россия",
//                    "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
//            lastochka.represent();
//
//            Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
//                    "", 270, 1700, 0, "Лениградский вокзал", "Лениград-Пассажирский", 8);
//            leningrad.represent();
//
//            System.out.println();
//
//            Bus volgaBus = new Bus("VolgaBus", "5270GH", 2017, "Россия", "желтый", 85);
//            volgaBus.represent();
//
//            Bus mercSprinter2Gen = new Bus("Mercedes-Benz", "Sprinter II", 2006, "Германия", "белый", 0);
//            mercSprinter2Gen.represent();
//
//            Bus hyundaiH350 = new Bus("Hyundai", "H350", 2015, "Южная Корея", "черный", 0);
//            hyundaiH350.represent();

//            System.out.println();

//            Herbivorous gazelle = new Herbivorous("Газель", "Айк", 5, "степи, пустыни, полупустыни", 80, "");
//            System.out.println(gazelle.toString());
//            Herbivorous giraffe = new Herbivorous("Жираф", "Нея", 7, "саванны и заповедники", 55, "листья деревьев и травы");
//            System.out.println(giraffe.toString());
//            Herbivorous horse = new Herbivorous("Лошадь", "Маша", 13,"степи", 88, "");
//            System.out.println(horse.toString());
//
//            Predator hyena = new Predator("Гиена", "Чет", 4, "Африка и юго-западная Азия", 64, "охота и падаль");
//            System.out.println(hyena.toString());
//            Predator tiger = new Predator("Тигр", "Вэл", 8, "тропические леса, мангровые болота" +
//                    " и бамбуковые чащи в тропиках, сухие саванны, полупустыни, каменистые сопки и тайга", 49-65, "");
//            System.out.println(tiger.toString());
//            Predator bear = new Predator("Бурый медведь", "Иван", 11, "тундру, альпийские луга" +
//                    " и побережья Северной Америки, леса России, горные и лесные массивы Европы", 56, "всеядный");
//            System.out.println(bear.toString());
//
//            Amphibian frog = new Amphibian("Лягушка", "Клава", 1, "");
//            System.out.println(frog.toString());
//            Amphibian grassSnake = new Amphibian("Удавовидный уж", "Кен", 2, "на суше около пресных водоемов");
//            System.out.println(grassSnake.toString());
//
//            FlightlessBird peacock = new FlightlessBird("Павлин", "Кеша", 3, "джунгли и леса", "");
//            System.out.println(peacock.toString());
//            FlightlessBird penguin = new FlightlessBird("Пингвин", "Павел", 2, "Новая Зеландия," +
//                    " Австралия, Чили, Аргентина, Южная Африка, Антарктида, субарктические острова", "");
//            System.out.println(penguin.toString());
//            FlightlessBird dodo = new FlightlessBird("Птица Додо", " ", 0, "предположительно" +
//                    " леса", "");
//            System.out.println("Вымерла: " + dodo.toString());
//
//            FlyingBird seagull = new FlyingBird("Чайка", "Глаша", 2, "берега морей и океанов",
//                    "");
//            System.out.println(seagull.toString());
//            FlyingBird albatross = new FlyingBird("Альбатрос", "Тон", 4, "Южный океан", "");
//            System.out.println(albatross.toString());
//            FlyingBird falcon = new FlyingBird("Сокол", "Бен", 2, "пустыни, тундра, тайга, луга," +
//                    " саванны, кустарниковые леса, горы", "");
//            System.out.println(falcon.toString());
//
//            System.out.println();

            LightVehicle lightVehicle1 = new LightVehicle("Легковая машина", "1", 2);
            LightVehicle lightVehicle2 = new LightVehicle("Легковая машина", "2", 1.5);
            LightVehicle lightVehicle3 = new LightVehicle("Легковая машина", "3", 3);
            LightVehicle lightVehicle4 = new LightVehicle("Легковая машина", "4", 2.5);

            Bus bus1 = new Bus("Автобус", "1", 6.5);
            Bus bus2 = new Bus("Автобус", "2", 5);
            Bus bus3 = new Bus("Автобус", "3", 7);
            Bus bus4 = new Bus("Автобус", "4", 5.5);

            Truck truck1 = new Truck("Грузовик", "1", 15);
            Truck truck2 = new Truck("Грузовик", "2", 14);
            Truck truck3 = new Truck("Грузовик", "3", 16);
            Truck truck4 = new Truck("Грузовик", "4", 15.5);

            Driver<LightVehicle> driver1 = new Driver<>("Водитель 1", "есть", 2, lightVehicle4);
            driver1.represent();
            driver1.getCar().setPitStop(2);
            driver1.getCar().pitStop();

            Driver<Truck> driver2 = new Driver<>("Водитель 2", "", 5, truck2);
            driver2.setCar(truck2);
            driver2.represent();
            driver2.getCar().setBestLapTime(42.2);
            driver2.getCar().bestLapTime();

            Driver<Bus> driver3 = new Driver<>("", "есть", 3, bus3);
            driver3.setCar(bus4);
            driver3.represent();
            driver3.getCar().maxSpeed();

            System.out.println();

            checkService(lightVehicle4, truck2, bus3);

            System.out.println();

            lightVehicle1.setBodyType(LightVehicle.BodyType.SEDAN);
            LightVehicle.BodyType.identifyBodyType(lightVehicle1.getBodyType());
            bus1.setCapacityNumber(90);
            Bus.CapacityType.identifyCapacityType(bus1.getCapacityNumber());
            truck1.setCapacityNumber(30);
            Truck.LoadCapacityType.identifyCapacityType(truck1.getCapacityNumber());

            System.out.println();

            Data.checkData("sdп", "ркпв", "sfkj2");

            System.out.println();

            Car.Sponsor sponsor1 = new Car.Sponsor("Спонсор 1", 50000);
            Car.Sponsor sponsor2 = new Car.Sponsor("Спонсор 2", 100000);
            Car.Sponsor sponsor3 = new Car.Sponsor("Спонсор 3", 70000);
            Mechanic<LightVehicle> mechanic1 = new Mechanic<>("Механик 1", "Компания 1");
            Mechanic<Bus> mechanic2 = new Mechanic<>("Механик 2", "Компания 2");
            Mechanic<Truck> mechanic3 = new Mechanic<>("Механик 3", "Компания 3");
            Mechanic<Car> mechanic4 = new Mechanic<>("Механик 4", "Компания 4");
            lightVehicle4.setMechanicsList(mechanic1, mechanic4);
            bus3.setMechanicsList(mechanic2, mechanic4);
            truck2.setMechanicsList(mechanic3, mechanic4);
            sponsor1.sponsorRace(lightVehicle4, bus3, truck1);
            sponsor2.sponsorRace(lightVehicle4, bus2, truck2);
            sponsor3.sponsorRace(lightVehicle2, bus4, truck2);
            lightVehicle4.represent();
            bus3.represent();
            truck2.represent();


            System.out.println();

            Car.getAllCompetitorCars();

            System.out.println();

            MarketQueue.addToQueue("Покупатель 1", "Покупатель 2", "Покупатель 3", "Покупатель 4",
                    "Покупатель 5", "Покупатель 6", "Покупатель 7", "Покупатель 8", "Покупатель 9", "Покупатель 10",
                    "Покупатель 11", "Покупатель 12", "Покупатель 13", "Покупатель 14");

            MarketQueue.deleteRandomBuyer();
            MarketQueue.deleteRandomBuyer();
            MarketQueue.deleteRandomBuyer();
            MarketQueue.getQueues();

            System.out.println();

            ProductList.Product banana = new ProductList.Product("Бананы", 50, 1);
            ProductList.Product milk = new ProductList.Product("Молоко", 100, 1);
            ProductList.Product sugar = new ProductList.Product("Сахар", 70, 0.3);
            ProductList.Product iceCream = new ProductList.Product("Мороженое", 130, 0.5);

            ProductList.Product flour = new ProductList.Product("Мука пшеничная В/С", 50, 1);
            ProductList.Product butter = new ProductList.Product("Масло сливочное", 100, 0.5);
            ProductList.Product egg = new ProductList.Product("Яйцо куриное", 100, 1);

            ProductList productList1 = new ProductList(banana, milk, sugar, iceCream);
            ProductList productList2 = new ProductList(banana, flour, sugar, milk, butter, egg);

            Recipe cocktail = new Recipe("Молочный коктейль", productList1);
            cocktail.represent();

            System.out.println();

            Recipe bananaPie = new Recipe("Банановый пирог", productList2);
            bananaPie.represent();

            Recipe.RecipeBook recipeBook1 = new Recipe.RecipeBook(cocktail, bananaPie);
            recipeBook1.represent();

            System.out.println();

            int[] intList = new int[20];

            System.out.println("Все случайные целые числа:");
            for (int i = 0; i < 20; i++) {
                    intList[i] = new Random().nextInt();
                    System.out.println(intList[i]);
            }

            System.out.println();

            System.out.println("Только четные числа:");
            for (int i = 0; i < intList.length; i++) {
                    if (intList[i] % 2 == 0 && intList[i] != 0) {
                        System.out.println(intList[i]);
                    } else intList[i] = 0;
            }

            System.out.println();

        TaskList taskList1 = new TaskList();
        taskList1.getTaskList();

        System.out.println();

        Passport passport1 = new Passport(1, "Имя 1", "Фамилия 1", "", "24.11.2000");
        Passport passport2 = new Passport(2, "Имя 2", "Фамилия 2", "", "24.11.1998");
        Passport passport3 = new Passport(3, "Имя 3", "Фамилия 3", "", "24.11.2001");
        Passport passport4 = new Passport(4, "Имя 4", "Фамилия 4", "", "24.11.2005");

        Passport.findByID(2, 1, 3);
    }
}