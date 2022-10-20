public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1987, "Максим", "Минск", "Бренд-менеджер");
        maxim.represent();

        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        anya.represent();

        Human katya = new Human(1994, "Катя", "Калинград", "Продакт-менеджер");
        katya.represent();

        Human artyom = new Human(1995, "Артём", "Москва", "Директор по развитию бизнеса");
        artyom.represent();

        System.out.println("");

        Car ladaGranta = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        ladaGranta.represent();

        Car audiA8 = new Car("Audi", "A8 50l TDI quattro", 3.0, "Черный", 2020, "Германия");
        audiA8.represent();

        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        bmwZ8.represent();

        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        kiaSportage4.represent();

        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        hyundaiAvante.represent();
    }
}