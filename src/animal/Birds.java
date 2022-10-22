package animal;

public abstract class Birds extends Animals{
    private final String habitat;

    public Birds(String family, String name, int age, String habitat) {
        super(family, name, age);
        if (habitat != null && !habitat.equals("")) {
            this.habitat = habitat;
        } else this.habitat = "наземно-воздушная";
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void eat() {
        System.out.println("Иду охотиться");
    }
}
