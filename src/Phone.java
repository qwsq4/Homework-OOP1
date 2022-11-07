import java.util.HashMap;
import java.util.Map;

public class Phone {
    private String name;
    private String phoneNumber;
    private static Map<String, String> phoneBook = new HashMap<>();

    public Phone(String name, String phoneNumber) {
        this.name = checkNulity(name, "Не указано");
        this.phoneNumber = checkNulity(phoneNumber, "Не указано");
        if (!name.equals("Не указано")) {
            phoneBook.put(this.name, this.phoneNumber);
        } else System.out.println("Невозможно добавить номер в телефонную книгу без указания имени");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    private static String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        } return value;
    }
}
