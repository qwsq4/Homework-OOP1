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
            this.name = name;
            this.town = town;
            this.job = job;
        }

    human(int yearOfBirth, String name, String town) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
            this.name = name;
            this.town = town;
        }

    human(int yearOfBirth, String name) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
            this.name = name;
        }

    human(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }
    void represent() {
        if (name != null && town != null && job != null) {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
        } else {
            System.out.println("Информация не указана");
        }
    }
}
