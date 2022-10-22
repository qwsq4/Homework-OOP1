package animal;

import java.util.Objects;

public final class Amphibians extends Animals{
    private final String habitat;

    public Amphibians(String family, String name, int age, String habitat) {
        super(family, name, age);
        if (habitat == null || habitat.equals("")) {
            this.habitat = "около водоемов";
        } else this.habitat = habitat;
    }

    public final String getHabitat() {
        return habitat;
    }

    @Override
    public void eat() {
        System.out.println("Иду охотиться");
    }

    @Override
    public void go() {
        System.out.println("Иду/плыву");
    }

    @Override
    public String toString() {
        return getFamily() + " " + getName() + " - земноводное. Возраст - " + getAge() + " лет, " +
                "среда обитания - " + getHabitat() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else return Objects.equals(getFamily(), ((Amphibians) o).getFamily()) && Objects.equals(getName(),
                ((Amphibians) o).getName()) && getAge() == ((Amphibians) o).getAge() && Objects.equals(habitat,
                ((Amphibians) o).habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, getName(), getAge(),getFamily());
    }
}
