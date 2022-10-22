package animal;

import java.util.Objects;

public final class Predator extends Mammals{
    private String foodType;

    public Predator(String family, String name, int age, String habitat, int movementSpeed, String foodType) {
        super(family, name, age, habitat, movementSpeed);
        if (foodType == null || foodType.equals("")) {
            this.foodType = "охота";
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
        System.out.println("Иду охотиться");
    }

    @Override
    public String toString() {
        return getFamily() + " " + getName() + " - хищное млекопитающее животное. Возраст - " + getAge() + " лет, " +
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
        } else return Objects.equals(getFamily(), ((Predator) o).getFamily()) && Objects.equals(getName(),
                ((Predator) o).getName()) && getAge() == ((Predator) o).getAge() && Objects.equals(getHabitat(),
                ((Predator) o).getHabitat()) && getMovementSpeed() == ((Predator) o).getMovementSpeed() &&
                Objects.equals(foodType, ((Predator) o).foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getName(), getAge(),getFamily(), getMovementSpeed(), foodType);
    }
}
