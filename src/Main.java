import transport.Car;

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
            Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механика", "Универсал", "Н826ГО658", 4, "Зимняя", insurance);
            ladaGranta.represent();
            Car audiA8 = new Car("Audi", "A8 50l TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "Седан", "Н53ОН732", 4, "Летняя", insurance2);
            audiA8.represent();
            Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "Седан", "Ш721МИ235", 2, "Зимняя", insurance);
            bmwZ8.represent();
            Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механика", "Седан", "Г342ГИ431", 4, "Зимняя", insurance1);
            kiaSportage4.represent();
            Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "Универсал", "С342ОЛ697", 4, "Летняя", insurance2);
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
    }
}