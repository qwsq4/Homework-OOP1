public class Main {
    public static void main(String[] args) {
        human maxim = new human(1987, "Максим", "Минск");
        maxim.represent();

        human anya = new human(1993, "Аня", "Москва", "Методист образовательных программ");
        anya.represent();

        human katya = new human(1994, "Катя", "Калинград", "Продакт-менеджер");
        katya.represent();

        human artyom = new human(1995, "Артём", "Москва", "Директор по развитию бизнеса");
        artyom.represent();



        car ladaGranta = new car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        System.out.println(ladaGranta.brand + " " + ladaGranta.model + ", год выпуска - " + ladaGranta.productionYear +  ", страна сборки - " + ladaGranta.productionCountry + ", цвет - " + ladaGranta.color + ", объем двигателя - " + ladaGranta.engineVolume + " л.");

        car audiA8 = new car("Audi", "A8 50l TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println(audiA8.brand + " " + audiA8.model + ", год выпуска - " + audiA8.productionYear +  ", страна сборки - " + audiA8.productionCountry + ", цвет - " + audiA8.color + ", объем двигателя - " + audiA8.engineVolume + " л.");

        car bmwZ8 = new car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println(bmwZ8.brand + " " + bmwZ8.model + ", год выпуска - " + bmwZ8.productionYear +  ", страна сборки - " + bmwZ8.productionCountry + ", цвет - " + bmwZ8.color + ", объем двигателя - " + bmwZ8.engineVolume + " л.");

        car kiaSportage4 = new car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея");
        System.out.println(kiaSportage4.brand + " " + kiaSportage4.model + ", год выпуска - " + kiaSportage4.productionYear +  ", страна сборки - " + kiaSportage4.productionCountry + ", цвет - " + kiaSportage4.color + ", объем двигателя - " + kiaSportage4.engineVolume + " л.");

        car hyundaiAvante = new car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println(hyundaiAvante.brand + " " + hyundaiAvante.model + ", год выпуска - " + hyundaiAvante.productionYear +  ", страна сборки - " + hyundaiAvante.productionCountry + ", цвет - " + hyundaiAvante.color + ", объем двигателя - " + hyundaiAvante.engineVolume + " л.");
    }
}