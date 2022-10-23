import java.text.DecimalFormat;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = checkNullity(name, "Default");
        this.flowerColor = checkNullity(flowerColor, "белый");
        this.country = checkNullity(country, "Россия");

        if (cost >= 0) {
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

    public String checkNullity(String value, String replace) {
        if (value == null || value.equals("")) {
            return replace;
        } else return value;
    }

    public void represent() {
        System.out.println(this.name + ", цвет - " + this.flowerColor + ", цена - " + this.cost + ", срок стояния - " + this.lifeSpan);
    }
}
