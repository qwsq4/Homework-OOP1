package animal;

import java.util.Objects;

public final class FlyingBird extends Birds{
    private final String movementType;

    public FlyingBird(String family, String name, int age, String habitat, String movementType) {
        super(family, name, age, habitat);
        if (movementType == null || movementType.equals("")) {
            this.movementType = "полет";
        } else this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void go() {
        System.out.println("Взлетаю");
        System.out.println("Лечу");
    }

    @Override
    public String toString() {
        return getFamily() + " " + getName() + " - летающая птица. Возраст - " + getAge() + " лет, " +
                "среда обитания - " + getHabitat() + ", тип передвижения - " +
                getMovementType() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else return Objects.equals(getFamily(), ((FlyingBird) o).getFamily()) && Objects.equals(getName(),
                ((FlyingBird) o).getName()) && getAge() == ((FlyingBird) o).getAge() && Objects.equals(getHabitat(),
                ((FlyingBird) o).getHabitat()) && Objects.equals(movementType, ((FlyingBird) o).movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getName(), getAge(),getFamily(), movementType);
    }
}
