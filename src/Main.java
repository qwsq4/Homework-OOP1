public class Main {
    public static void main(String[] args) {
        human maxim = new human();
        maxim.yearOfBirth = 1987;
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.job = "Бренд-менеджер";
        System.out.println("Привет! Меня зовут " + maxim.name +  ". Я из города " + maxim.town + ". Я родился в " + maxim.yearOfBirth + " году. Я работаю на должности " + maxim.job + ". Будем знакомы!");

        human anya = new human();
        anya.yearOfBirth = 1993;
        anya.name = "Аня";
        anya.town = "Москва";
        anya.job = "Методист образовательных программ";
        System.out.println("Привет! Меня зовут " + anya.name +  ". Я из города " + anya.town + ". Я родился в " + anya.yearOfBirth + " году. Я работаю на должности " + anya.job + ". Будем знакомы!");

        human katya = new human();
        katya.yearOfBirth = 1994;
        katya.name = "Катя";
        katya.town = "Калинград";
        katya.job = "Продакт-менеджер";
        System.out.println("Привет! Меня зовут " + katya.name +  ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");

        human artyom = new human();
        artyom.yearOfBirth = 1995;
        artyom.name = "Артём";
        artyom.town = "Москва";
        artyom.job = "Директор по развитию бизнеса";
        System.out.println("Привет! Меня зовут " + artyom.name +  ". Я из города " + artyom.town + ". Я родился в " + artyom.yearOfBirth + " году. Я работаю на должности " + artyom.job + ". Будем знакомы!");



        car ladaGranta = new car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.color = "Желтый";
        ladaGranta.productionCountry = "Россия";
        ladaGranta.productionYear = 2015;
        ladaGranta.engineVolume = 1.7;
        System.out.println(ladaGranta.brand + " " + ladaGranta.model + ", год выпуска - " + ladaGranta.productionYear +  ", страна сборки - " + ladaGranta.productionCountry + ", цвет - " + ladaGranta.color + ", объем двигателя - " + ladaGranta.engineVolume + " л.");

        car audiA8 = new car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50l TDI quattro";
        audiA8.color = "Черный";
        audiA8.productionCountry = "Германия";
        audiA8.productionYear = 2020;
        audiA8.engineVolume = 3.0;
        System.out.println(audiA8.brand + " " + audiA8.model + ", год выпуска - " + audiA8.productionYear +  ", страна сборки - " + audiA8.productionCountry + ", цвет - " + audiA8.color + ", объем двигателя - " + audiA8.engineVolume + " л.");

        car bmwZ8 = new car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.color = "Черный";
        bmwZ8.productionCountry = "Германия";
        bmwZ8.productionYear = 2021;
        bmwZ8.engineVolume = 3.0;
        System.out.println(bmwZ8.brand + " " + bmwZ8.model + ", год выпуска - " + bmwZ8.productionYear +  ", страна сборки - " + bmwZ8.productionCountry + ", цвет - " + bmwZ8.color + ", объем двигателя - " + bmwZ8.engineVolume + " л.");

        car kiaSportage4 = new car();
        kiaSportage4.brand = "Kia";
        kiaSportage4.model = "Sportage 4-го поколения";
        kiaSportage4.color = "Красный";
        kiaSportage4.productionCountry = "Южная Корея";
        kiaSportage4.productionYear = 2018;
        kiaSportage4.engineVolume = 2.4;
        System.out.println(kiaSportage4.brand + " " + kiaSportage4.model + ", год выпуска - " + kiaSportage4.productionYear +  ", страна сборки - " + kiaSportage4.productionCountry + ", цвет - " + kiaSportage4.color + ", объем двигателя - " + kiaSportage4.engineVolume + " л.");

        car hyundaiAvante = new car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.color = "Оранжевый";
        hyundaiAvante.productionCountry = "Южная Корея";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.engineVolume = 1.6;
        System.out.println(hyundaiAvante.brand + " " + hyundaiAvante.model + ", год выпуска - " + hyundaiAvante.productionYear +  ", страна сборки - " + hyundaiAvante.productionCountry + ", цвет - " + hyundaiAvante.color + ", объем двигателя - " + hyundaiAvante.engineVolume + " л.");
    }
}