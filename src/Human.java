public class Human {
    private final int yearOfBirth;
    private String name;
    private String town;
    private String job;

    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name != null && town != null && job != null) {
            this.name = name;
            this.town = town;
            this.job = job;
        } else {
            this.name = "Информация не указана";
            this.town = "Информация не указана";
            this.job = "Информация не указана";
        }

    }
    public void represent() {
        System.out.println("Привет! Меня зовут " + this.name +  ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
        }
}
