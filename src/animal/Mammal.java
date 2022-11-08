//package animal;
//
//public abstract class Mammal extends Animals {
//    private final String habitat;
//    private final int movementSpeed;
//
//    public Mammal(String family, String name, int age, String habitat, int movementSpeed) {
//        super(family, name, age);
//        this.habitat = checkNulity(habitat, "наземно-воздушная");
//        if (movementSpeed > 0) {
//            this.movementSpeed = movementSpeed;
//        } else this.movementSpeed = 20;
//    }
//
//    public String getHabitat() {
//        return habitat;
//    }
//
//    public int getMovementSpeed() {
//        return movementSpeed;
//    }
//
//    @Override
//    public void go() {
//        System.out.println("Иду гулять");
//    }
//}
