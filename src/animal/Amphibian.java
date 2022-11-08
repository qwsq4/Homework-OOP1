//package animal;
//
//import java.util.Objects;
//
//public final class Amphibian extends Animals{
//    private final String habitat;
//
//    public Amphibian(String family, String name, int age, String habitat) {
//        super(family, name, age);
//        this.habitat = checkNulity(habitat, "около водоемов");
//    }
//
//    public final String getHabitat() {
//        return habitat;
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Иду охотиться");
//    }
//
//    @Override
//    public void go() {
//        System.out.println("Иду/плыву");
//    }
//
//    @Override
//    public String toString() {
//        return getFamily() + " " + getName() + " - земноводное. Возраст - " + getAge() + " лет, " +
//                "среда обитания - " + getHabitat() + ".";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this.hashCode() == o.hashCode()) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        } else return Objects.equals(getFamily(), ((Amphibian) o).getFamily()) && Objects.equals(getName(),
//                ((Amphibian) o).getName()) && getAge() == ((Amphibian) o).getAge() && Objects.equals(habitat,
//                ((Amphibian) o).habitat);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(habitat, getName(), getAge(),getFamily());
//    }
//}
