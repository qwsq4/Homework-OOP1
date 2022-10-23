import animal.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void bouquetCalculate(Flower[] flower){
            double bouquetCost = 0;
            for (int i = 0; i < flower.length; i++) {
                bouquetCost = bouquetCost + flower[i].getCost();
            }
            bouquetCost = bouquetCost + bouquetCost / 100 * 10;

            int bouquetLifeSpan = 1000000;
            for (int i = 0; i < flower.length; i++) {
                if (bouquetLifeSpan > flower[i].lifeSpan) {
                    bouquetLifeSpan = flower[i].lifeSpan;
                }
            }

            String bouquetComposition = flower[0].getName();
            for (int i = 1; i < flower.length; i++) {
                    bouquetComposition = bouquetComposition + ", " + flower[i].getName();
            }

        System.out.println ("Состав букета - " + bouquetComposition + ". Стоимость букета - " + String.format("%.2f", bouquetCost) + " руб., срок стояния - " + bouquetLifeSpan + " дней");
    }

    public static void main(String[] args){
            Human maxim = new Human(1987, "Максим", "Минск", "Бренд-менеджер");
            maxim.represent();
            Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
            anya.represent();
            Human katya = new Human(1994, "Катя", "Калинград", "Продакт-менеджер");
            katya.represent();
            Human artyom = new Human(1995, "Артём", "Москва", "Директор по развитию бизнеса");
            artyom.represent();
            Human vladimir = new Human(2001, "Владимир", "Казань", "");
            vladimir.represent();

            System.out.println();

            Car.Insurance insurance = new Car.Insurance(2020, 1, 9000, "9ПА46ВФ75");
            Car.Insurance insurance1 = new Car.Insurance(2015, 2, 20000, "942АЦУ544");
            Car.Insurance insurance2 = new Car.Insurance(2019, 1, 11000, "ЩЦВ9415АА");
            Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "Универсал", "Н826ГО658", 4, "Зимняя", insurance, 200);
            ladaGranta.represent();

            Car audiA8 = new Car("Audi", "A8 50l TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "Седан", "Н53ОН732", 4, "Летняя", insurance2, 300);
            audiA8.represent();

            Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "Седан", "Ш721МИ235", 2, "Зимняя", insurance, 250);
            bmwZ8.represent();

            Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механика", "Седан", "Г342ГИ431", 4, "Зимняя", insurance1, 240);
            kiaSportage4.represent();

            Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "Универсал", "С342ОЛ697", 4, "Летняя", insurance2, 260);
            hyundaiAvante.represent();

            System.out.println();

            Flower rose = new Flower("Роза обыкновенная", "красный", "Голландия", 35.59, 0);
            rose.represent();
            Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
            chrysanthemum.represent();
            Flower peony = new Flower("Пион", "", "Англия", 69.9, 1);
            peony.represent();
            Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
            gypsophila.represent();

            System.out.println();

            Flower[] bouquet = {rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila};
            bouquetCalculate(bouquet);

            System.out.println();

            Train lastochka = new Train("Ласточка", "BD-901", 2011, "Россия",
                    "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
            lastochka.represent();

            Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                    "", 270, 1700, 0, "Лениградский вокзал", "Лениград-Пассажирский", 8);
            leningrad.represent();

            System.out.println();

            Bus volgaBus = new Bus("VolgaBus", "5270GH", 2017, "Россия", "желтый", 85);
            volgaBus.represent();

            Bus mercSprinter2Gen = new Bus("Mercedes-Benz", "Sprinter II", 2006, "Германия", "белый", 0);
            mercSprinter2Gen.represent();

            Bus hyundaiH350 = new Bus("Hyundai", "H350", 2015, "Южная Корея", "черный", 0);
            hyundaiH350.represent();

            System.out.println();

            Herbivorous gazelle = new Herbivorous("Газель", "Айк", 5, "степи, пустыни, полупустыни", 80, "");
            System.out.println(gazelle.toString());
            Herbivorous giraffe = new Herbivorous("Жираф", "Нея", 7, "саванны и заповедники", 55, "листья деревьев и травы");
            System.out.println(giraffe.toString());
            Herbivorous horse = new Herbivorous("Лошадь", "Маша", 13,"степи", 88, "");
            System.out.println(horse.toString());

            Predator hyena = new Predator("Гиена", "Чет", 4, "Африка и юго-западная Азия", 64, "охота и падаль");
            System.out.println(hyena.toString());
            Predator tiger = new Predator("Тигр", "Вэл", 8, "тропические леса, мангровые болота" +
                    " и бамбуковые чащи в тропиках, сухие саванны, полупустыни, каменистые сопки и тайга", 49-65, "");
            System.out.println(tiger.toString());
            Predator bear = new Predator("Бурый медведь", "Иван", 11, "тундру, альпийские луга" +
                    " и побережья Северной Америки, леса России, горные и лесные массивы Европы", 56, "всеядный");
            System.out.println(bear.toString());

            Amphibians frog = new Amphibians("Лягушка", "Клава", 1, "");
            System.out.println(frog.toString());
            Amphibians grassSnake = new Amphibians("Удавовидный уж", "Кен", 2, "на суше около пресных водоемов");
            System.out.println(grassSnake.toString());

            FlightlessBird peacock = new FlightlessBird("Павлин", "Кеша", 3, "джунгли и леса", "");
            System.out.println(peacock.toString());
            FlightlessBird penguin = new FlightlessBird("Пингвин", "Павел", 2, "Новая Зеландия," +
                    " Австралия, Чили, Аргентина, Южная Африка, Антарктида, субарктические острова", "");
            System.out.println(penguin.toString());
            FlightlessBird dodo = new FlightlessBird("Птица Додо", "-", 0, "предположительно" +
                    " леса", "");
            System.out.println("Вымерла - " + dodo.toString());

            FlyingBird seagull = new FlyingBird("Чайка", "Глаша", 2, "берега морей и океанов",
                    "");
            System.out.println(seagull.toString());
            FlyingBird albatross = new FlyingBird("Альбатрос", "Тон", 4, "Южный океан", "");
            System.out.println(albatross.toString());
            FlyingBird falcon = new FlyingBird("Сокол", "Бен", 2, "пустыни, тундра, тайга, луга," +
                    " саванны, кустарниковые леса, горы", "");
            System.out.println(falcon.toString());
    }
}