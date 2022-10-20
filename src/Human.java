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
        this.name = checkNulity(name);
        this.town = checkNulity(town);
        this.job = checkNulity(job);
    }
    public void represent() {
        System.out.println("Привет! Меня зовут " + this.name +  ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
        }

    public String checkNulity(String value) {
        if (value == null) {
            value = "Информация не указана";
        } return value;
    }
}
