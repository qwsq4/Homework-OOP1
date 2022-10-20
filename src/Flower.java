import java.text.DecimalFormat;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (checkNullity(name)) {
            this.name = "Информация не указана";
        } else this.name = name;

        if (checkNullity(flowerColor)) {
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;

        if (checkNullity(country)) {
            this.country = "Россия";
        } else this.country = country;

        if (cost <= 0) {
            this.cost = 1;
        } else this.cost = cost;

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public boolean checkNullity(String value) {
        if (value == null || value.equals("")) {
            return true;
        } else return false;
    }

    public void represent() {
        System.out.println(this.name + ", цвет - " + this.flowerColor + ", цена - " + this.cost + ", срок стояния - " + this.lifeSpan);
    }
}
