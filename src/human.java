public class human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (job != null) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }
    public void represent() {
        System.out.println("Привет! Меня зовут " + this.name +  ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
        }
}
