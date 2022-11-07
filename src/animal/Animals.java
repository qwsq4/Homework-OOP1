//package animal;
//
//public abstract class Animals {
//    private final String family; //Семейство
//    private final String name; //Кличка
//    private final int age; //Возраст
//
//    public Animals(String family, String name, int age) {
//        this.family = checkNulity(family, "Животное");
//        this.name = checkNulity(name, "Животное");
//        if (age >= 0) {
//            this.age = age;
//        } else this.age = 1;
//    }
//
//    public String checkNulity(String value, String replace) {
//        if (value == null || value.equals("")) {
//            value = replace;
//        } return value;
//    }
//
//    public final String getName() {
//        return name;
//    }
//
//    public final int getAge() {
//        return age;
//    }
//
//    public final String getFamily() {
//        return this.family;
//    }
//
//    public final void sleep() {
//        System.out.println("Иду спать");
//    }
//
//    public abstract void eat();
//
//    public abstract void go();
//}
