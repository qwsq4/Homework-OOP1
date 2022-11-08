//public class Human {
//    private int yearOfBirth;
//    private String name;
//    private String town;
//    private String job;
//
//    Human(int yearOfBirth, String name, String town, String job) {
//        if (yearOfBirth >= 0) {
//            this.yearOfBirth = yearOfBirth;
//        } else {
//            this.yearOfBirth = Math.abs(yearOfBirth);
//        }
//        this.name = checkNulity(name);
//        this.town = checkNulity(town);
//        this.job = checkNulity(job);
//    }
//    public void represent() {
//        System.out.println("Привет! Меня зовут " + this.name +  ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!");
//        }
//
//    public String checkNulity(String value) {
//        if (value == null || value.equals("")) {
//            value = "Информация не указана";
//        } return value;
//    }
//
//    public int getYearOfBirth() {
//        return yearOfBirth;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getTown() {
//        return town;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setYearOfBirth(int newYearOfBirth) {
//        if (newYearOfBirth > 0) {
//            this.yearOfBirth = newYearOfBirth;
//        } else {
//            this.yearOfBirth = 0;
//        }
//    }
//
//    public void setName(String newName) {
//        this.name = checkNulity(newName);
//    }
//
//    public void setTown(String newTown) {
//        this.town = checkNulity(newTown);
//    }
//
//    public void setJob(String newJob) {
//        this.job = checkNulity(newJob);
//    }
//}
