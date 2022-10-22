package animal;

import java.util.Objects;

public final class FlightlessBird extends Birds{
    private final String movementType;

    public FlightlessBird(String family, String name, int age, String habitat, String movementType) {
        super(family, name, age, habitat);
        if (movementType == null || movementType.equals("")) {
            this.movementType = "шаг";
        } else this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void go() {
        System.out.println("Иду гулять");
    }

    @Override
    public String toString() {
        return getFamily() + " " + getName() + " - нелетающая птица. Возраст - " + getAge() + " лет, " +
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
        } else return Objects.equals(getFamily(), ((FlightlessBird) o).getFamily()) && Objects.equals(getName(),
                ((FlightlessBird) o).getName()) && getAge() == ((FlightlessBird) o).getAge() && Objects.equals(getHabitat(),
                ((FlightlessBird) o).getHabitat()) && Objects.equals(movementType, ((FlightlessBird) o).movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getName(), getAge(),getFamily(), movementType);
    }
}
