public class Main {
    public static void main(String[] args) {
        human maxim = new human(1987, "Максим", "Минск", "Бренд-менеджер");
        maxim.represent();

        human anya = new human(1993, "Аня", "Москва", "Методист образовательных программ");
        anya.represent();

        human katya = new human(1994, "Катя", "Калинград", "Продакт-менеджер");
        katya.represent();

        human artyom = new human(1995, "Артём", "Москва", "Директор по развитию бизнеса");
        artyom.represent();



        car ladaGranta = new car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        ladaGranta.represent();

        car audiA8 = new car("Audi", "A8 50l TDI quattro", 3.0, "Черный", 2020, "Германия");
        audiA8.represent();
        car bmwZ8 = new car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        bmwZ8.represent();

        car kiaSportage4 = new car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        kiaSportage4.represent();

        car hyundaiAvante = new car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        hyundaiAvante.represent();
    }
}