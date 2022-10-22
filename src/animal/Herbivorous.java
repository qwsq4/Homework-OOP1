package animal;

import java.util.Objects;

public final class Herbivorous extends Mammals{
    private String foodType;

    public Herbivorous(String family, String name, int age, String habitat, int movementSpeed, String foodType) {
        super(family, name, age, habitat, movementSpeed);
        if (foodType == null || foodType.equals("")) {
            this.foodType = "травы";
        } else this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void eat() {
        System.out.println("Иду на пастбище");
    }

    @Override
    public String toString() {
        return getFamily() + " " + getName() + " - травоядное млекопитающее животное. Возраст - " + getAge() + " лет, " +
                "среда обитания - " + getHabitat() + ", скорость передвижения - " +
                getMovementSpeed() + " км/ч, способ пропитания - " + getFoodType() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else return Objects.equals(getFamily(), ((Herbivorous) o).getFamily()) && Objects.equals(getName(),
                ((Herbivorous) o).getName()) && getAge() == ((Herbivorous) o).getAge() && Objects.equals(getHabitat(),
                ((Herbivorous) o).getHabitat()) && getMovementSpeed() == ((Herbivorous) o).getMovementSpeed() &&
                Objects.equals(foodType, ((Herbivorous) o).foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getName(), getAge(),getFamily(), getMovementSpeed(), foodType);
    }
}
