package animal;

public abstract class Animals {
    private final String family; //Семейство
    private final String name; //Кличка
    private final int age; //Возраст

    public Animals(String family, String name, int age) {
        if (family != null && !family.equals("")) {
            this.family = family;
        } else this.family = "Животное";
        if (name != null && !name.equals("")) {
            this.name = name;
        } else this.name = "Животное";
        if (age >= 0) {
            this.age = age;
        } else this.age = 1;
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final String getFamily() {
        return this.family;
    }

    public final void sleep() {
        System.out.println("Иду спать");
    }

    public abstract void eat();

    public abstract void go();
}
