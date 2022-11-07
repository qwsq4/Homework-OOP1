
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Passport {
    private final int passportID;
    private String firstName;
    private String lastName;
    private String middleName;
    private final String dateOfBirth;
    private final List<String> passportData = new ArrayList<>();
    private static final Map<Integer, List<String>> data = new HashMap<>();

    public Passport(int passportID, String firstName, String lastName, String middleName, String dateOfBirth) {
        this.passportID = passportID;
        this.firstName = checkNulity(firstName, "Не указано");
        this.lastName = checkNulity(lastName, "Не указано");
        this.middleName = middleName;
        this.dateOfBirth = checkNulity(dateOfBirth, "Не указано");
        this.passportData.add(firstName);
        this.passportData.add(lastName);
        this.passportData.add(middleName);
        this.passportData.add(dateOfBirth);
        data.put(passportID, passportData);
    }

    public int getPassportID() {
        return passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public static void findByID(int... passportIDs) {
        for (int passportID : passportIDs) {
            if (data.containsKey(passportID)) {
                System.out.println(data.get(passportID).get(0) + " " + data.get(passportID).get(1) + " " +
                        data.get(passportID).get(2) + ", дата рождения - " + data.get(passportID).get(3));
            } else System.out.println("Номер паспорта недействительный");;
        }
    }

    public static String checkNulity(String value, String replace) {
        if (value == null || value.equals("")) {
            value = replace;
        } return value;
    }

    public static int checkZero(int value, int replace) {
        if (value > 0) {
            return value;
        } else return replace;
    }
}
